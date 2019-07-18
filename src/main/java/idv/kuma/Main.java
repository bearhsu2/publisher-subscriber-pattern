package idv.kuma;


public class Main {


    public static void main(String[] args) {

        Subject subject = new CardSubject();

        subject.addSubscriber(new CardSubscriber("Subscriber-1", subject));
        subject.addSubscriber(new CardSubscriber("Subscriber-2", subject));

        subject.issue();
    }


}
