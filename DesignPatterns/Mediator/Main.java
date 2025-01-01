import java.util.*;
// Mediator Interface
interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

// Concrete Mediator
class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Don't send the message to the sender
            if (u != user) {
                u.receive(message);
            }
        }
    }
}

// Abstract Colleague
abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

// Concrete Colleague 1
class BasicUser extends User {
    public BasicUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receives: " + message);
    }
}

// Concrete Colleague 2
class PremiumUser extends User {
    public PremiumUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends (Premium): " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receives (Premium): " + message);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new BasicUser(chatMediator, "Alice");
        User user2 = new PremiumUser(chatMediator, "Bob");
        User user3 = new BasicUser(chatMediator, "Charlie");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.send("Hi Everyone! i am Alice");
        user2.send("Hello Alice! i am Bob");
    }
}