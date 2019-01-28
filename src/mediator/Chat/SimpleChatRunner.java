package mediator.Chat;

public class SimpleChatRunner {
    public static void main(String[] args) {


    SimpleTextChat chat = new SimpleTextChat();
    User admin = new Admin(chat, "H");
    User user1 = new SimpleUser(chat, "Fer");
    User user2 = new SimpleUser(chat, "Deep");

    chat.setAdmin(admin);
    chat.addUserToChat(user1);
    chat.addUserToChat(user2);

    user1.sendMessege("Hi!");
    }
}
