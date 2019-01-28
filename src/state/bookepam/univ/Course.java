package state.bookepam.univ;

public class Course { // класс Context
    private long id;
    private String name;
    private Teacher teacher;
    private IState currentState;

    public Course(long id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        currentState = new StartState();
    }

    public void setTeacher(Teacher teacher) {        /* проверка имени и id курса на соответствие специализации преподавателя */
        this.teacher = teacher;
    }    // методы set и get

    public IState getCurrentState() {
        System.out.println(currentState.getClass().getSimpleName());
        return currentState;
    }

    public void learning() {
        currentState.learning();
    }

    public void cancel() {
        currentState.toCancel();
    } // классы состояний

    public class StartState implements IState {
        private IState nextState;

        public void learning() {
            if (Course.this.teacher != null) {
                currentState = new ProcessState();
                System.out.println("обучение начато");
            } else {
                this.toCancel();
                System.out.println("обучение не начато: нет преподавателя");
            }
        }

        public void toCancel() {
            currentState = new CancelledState();
            System.out.println("курс обучения отменен");
        }
    }

    public class ProcessState implements IState {
        private IState nextState = new EndState();

        public void learning() {
            currentState = nextState;

            System.out.println("обучение успешно завершено");         // формирование отчета        //сохранение результатов
        }

        public void toCancel() {
            throw new UnsupportedOperationException("Невозможно отменить уже начатый курс");
        }
    }

    public class EndState implements IState {
        private IState nextState = new StartState();

        public void learning() {
            currentState = nextState;   // назначение нового преподавателя
            Course.this.setTeacher(new Teacher());
            System.out.println("курс готов к началу обучения");
        }

        public void toCancel() {
            throw new UnsupportedOperationException("Курс уже закончен. Его проведение отменять нет смысла");
        }
    }

    public class CancelledState implements IState {
        private IState nextState = new EndState();

        public void learning() {
            currentState = new StartState();   // назначение нового преподавателя
            Course.this.setTeacher(new Teacher());
            System.out.println("курс готов к продолжению обучения");
        }

        public void toCancel() {
            throw new UnsupportedOperationException("Курс уже отменен");
        }
    }
}
