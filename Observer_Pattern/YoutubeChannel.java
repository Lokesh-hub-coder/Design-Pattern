import java.util.*;

class YoutubeChannel {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }

    public void uploadVideo(String title) {
        notifySubscribers(title);
    }

    private void notifySubscribers(String msg) {
        for(Observer o : subscribers) {
            o.update(msg);
        }
    }
}
