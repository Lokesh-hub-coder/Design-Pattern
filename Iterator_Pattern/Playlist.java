public class Playlist {
    private Song[] songs;
    private int size = 0;

    public Playlist(int capacity) {
        songs = new Song[capacity];
    }

    public void addSong(String name) {
        songs[size++] = new Song(name);
    }

    public PlaylistIterator getIterator() {
        return new PlaylistIteratorImpl();
    }

    // Inner class (Iterator implementation)
    private class PlaylistIteratorImpl implements PlaylistIterator {
        int index = 0;

        public boolean hasNext() {
            return index < size;
        }

        public Song next() {
            return songs[index++];
        }
    }
}
