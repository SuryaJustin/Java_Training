package Day1;

public class SpeakerFunt implements Power,Play, Volume {
    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void pause() {
        System.out.println("Pause music");
    }

    @Override
    public void powerON() {
        System.out.println("Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("Power Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }

    @Override
    public void volumeMute() {
        System.out.println("Volume Mute ");
    }
}
