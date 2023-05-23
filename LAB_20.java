import java.util.Scanner;

class VideoTape {
    private String title;
    private int length;

    public VideoTape(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "VideoTape: " + title + " (" + length + " minutes)";
    }
}

class Movie extends VideoTape {
    private String rating;

    public Movie(String title, int length, String rating) {
        super(title, length);
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle() + " (" + getLength() + " minutes, rated " + rating + ")";
    }
}

class MusicVideo extends VideoTape {
    private String artist;

    public MusicVideo(String title, int length, String artist) {
        super(title, length);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "MusicVideo: " + getTitle() + " (" + getLength() + " minutes, by " + artist + ")";
    }
}

public class LAB_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of the video: ");
        String title = scanner.nextLine();

        System.out.print("Enter the length of the video (in minutes): ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        VideoTape tape1 = new VideoTape(title, length);
        System.out.println(tape1);

        System.out.print("Enter the title of the movie: ");
        title = scanner.nextLine();

        System.out.print("Enter the length of the movie (in minutes): ");
        length = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        System.out.print("Enter the rating of the movie: ");
        String rating = scanner.nextLine();

        Movie movie1 = new Movie(title, length, rating);
        System.out.println(movie1);

        System.out.print("Enter the title of the music video: ");
        title = scanner.nextLine();

        System.out.print("Enter the length of the music video (in minutes): ");
        length = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        System.out.print("Enter the artist of the music video: ");
        String artist = scanner.nextLine();

        MusicVideo musicVideo1 = new MusicVideo(title, length, artist);
        System.out.println(musicVideo1);

        scanner.close();
    }
}
