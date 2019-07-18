package idv.kuma;

public interface Subject {
    void addSubscriber(Subscriber cardSubscriber);


    void issue();

    String getContext();
}
