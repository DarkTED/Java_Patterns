package mediator.Chat;

public class SimpleUser implements User {
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessege(String message) {
     chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String messag) {
        System.out.println(this.name + "receiving message: " + messag+ ".");
    }
}
