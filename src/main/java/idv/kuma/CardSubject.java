package idv.kuma;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CardSubject implements Subject {

    List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void issue() {
        this.subscribers.forEach(subscriber -> {
            subscriber.execute();
        });
    }

    @Override
    public String getContext() {
        return LocalDateTime.now().toString();
    }


}
