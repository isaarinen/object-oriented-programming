public class Television {
    public boolean isOn;
    public int channel;
    public Television() {
        this.isOn = false;
        this.channel = 0;
    }
    public void setChannel(int channel){
        if (channel > 10) channel = 1;
        this.channel = channel;
    }
    public int getChannel() {
        return this.channel;
    }
    public void pressOnOff() {
        this.isOn = !this.isOn;
    }
    public boolean isOn() {
        return isOn;
    }
}
