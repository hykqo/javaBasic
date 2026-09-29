package javaBasic.access;

public class Speaker {
    int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (this.volume >= 100){
            System.out.println("Volume is already at maximum.");
        }else{
            this.volume = Math.min(this.volume + 10, 100);
            System.out.println("Volume increased by 10.");
        }
    }

    void volumeDown() {
        if (this.volume <= 0){
            System.out.println("Volume is already at minimum.");
        }else{
            this.volume = Math.max(this.volume - 10, 0);
            System.out.println("Volume decreased by 10.");
        }
    }

    void showVolume() {
        System.out.println("Current volume: " + this.volume);

        if (this.volume > 100){
            System.out.println("Volume is too high! Bomb!");
        }
    }
}
