package mediator.Chat;

public class Admin implements User {
    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessege(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String messag) {
        System.out.println(this.name + "receving message: " + messag + ".");
    }
}
