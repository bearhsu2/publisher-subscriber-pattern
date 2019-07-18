package idv.kuma;

public class CardSubscriber implements Subscriber{
    private final String name;
    private final Subject subject;

    public CardSubscriber(String name, Subject subject) {
        this.name = name;
        this.subject   = subject;

    }

    @Override
    public void execute() {
        System.out.println(this.name + ": "+ subject.getContext());
    }
}
