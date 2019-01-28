package mediator.example.components;

import mediator.example.mediator.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
