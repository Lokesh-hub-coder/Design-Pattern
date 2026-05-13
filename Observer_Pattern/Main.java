public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber s1 = new Subscriber("Lokesh");
        Subscriber s2 = new Subscriber("Aman");

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.uploadVideo("Design Patterns Lecture");
    }
} 