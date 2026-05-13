public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist(5);

        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");

        PlaylistIterator it = playlist.getIterator();

        while(it.hasNext()) {
            Song song = it.next();
            System.out.println(song.getName());
        }
    }
}


