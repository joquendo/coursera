public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}
	
	public void play() {
        System.out.println("Play Song");
    }

    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
        System.out.println("Set playback speed to " + speed);
    }

    public String getName() {
        return this.songName;
    }

	public String getArtist() {
        return this.artist;
    }
}
