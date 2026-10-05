public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");



        Track defaultTrack = new Track();

        System.out.println("Default Track:");
        System.out.println(defaultTrack);
        System.out.println();

        Track justTile =
                new Track("Neon Lights");

        System.out.println("Title-only Track:");
        System.out.println(justTile);
        System.out.println();

        Track titleArtist =
                new Track("Ocean Drive", "Midnight Pulse");

        System.out.println("Title + Artist Track:");
        System.out.println(titleArtist);
        System.out.println();

        Track fullTrack =
                new Track("Raindrop Waltz", "Clara Voss", 210, false);

        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack);
        System.out.println();

        System.out.println("Invalid Duration Test:");

        Track invalidTrack =
                new Track("Broken Clock", "Static Noise", -50, false);

        System.out.println(invalidTrack);
        System.out.println();

        Track getterTrack =
                new Track("Stardust", "Stellar Echo", 242, true);

        System.out.println("Getter Test:");
        System.out.println("Title: " + getterTrack.getTitle());
        System.out.println("Artist: " + getterTrack.getArtist());
        System.out.println("Duration: " + getterTrack.getDurationFormatted());
        System.out.println("Explicit: " + getterTrack.getIsExplicit());
    }
}