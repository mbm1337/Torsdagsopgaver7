package TV;

public class TV {

    public boolean isOn;
    public int channel;

    public int volume;

    public TV() {
        isOn = false;
        channel = 1;
        volume = 10;

    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    public void setChannel(int channel){
        if(isOn) {
            if (channel <= 30)
                this.channel = channel;
        }else{
            System.out.println("Only 30 channels available");
        }
    }

    public void channelUp(){
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

    public void setVolume(int volume){
        if(isOn) {
            if (volume <= 100)
                this.volume = volume;
        }else{
            System.out.println("You can only turn volume to 100");
        }
    }

    public void volumeUp(){
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
