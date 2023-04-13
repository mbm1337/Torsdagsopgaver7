public class TV {

    boolean isOn;
    int channel;

    int volume;

    public TV() {
        isOn = false;
        channel = 1;
        volume = 10;

    }

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }

    void setChannel(int channel){
        if(isOn) {
            if (channel <= 30)
                this.channel = channel;
        }else{
            System.out.println("Only 30 channels available");
        }
    }

    void channelUp(){
        if (isOn){
            if(channel < 30) {
                channel++;
            } else {
                channel = 1;
            }
        }else {
            turnOn();
        }
    }

    void channelDown(){
        if(isOn){
            if (channel> 1) {
                channel--;
            }else {
                channel = 30;
            }
        }else {
            turnOn();
        }
    }

    void setVolume(int volume){
        if(isOn) {
            if (volume <= 100)
                this.volume = volume;
        }else{
            System.out.println("You can only turn volume to 100");
        }
    }

    void volumeUp(){
        if (isOn){
            if(volume < 100) {
                volume++;
            } else {
                volume = 100;
            }
        }
    }

    void volumeDown(){
        if(isOn){
            if (volume > 0) {
                volume--;
            }else {
                volume = 0;
            }
        }
    }

    void mute(){
        if(isOn){
            volume = 0;
        }
    }

}
