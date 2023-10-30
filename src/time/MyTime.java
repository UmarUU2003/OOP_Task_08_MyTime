package time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour >= 0 ? hour % 24 : hour > -24 ? (hour + 24) : Math.abs(hour) % 24;
        this.minute = minute >= 0 ? minute % 60 : minute > -60 ? (minute + 60) : Math.abs(minute) % 60;
        this.second = second >= 0 ? second % 60 : second > -60 ? (second + 60) : Math.abs(second) % 60;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour >= 0 ? hour % 24 : hour > -24 ? (hour + 24) : Math.abs(hour) % 24;
        this.minute = minute >= 0 ? minute % 60 : minute > -60 ? (minute + 60) : Math.abs(minute) % 60;
        this.second = second >= 0 ? second % 60 : second > -60 ? (second + 60) : Math.abs(second) % 60;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour >= 0 ? hour % 24 : hour > -24 ? (hour + 24) : Math.abs(hour) % 24;
    }

    public void setMinute(int minute) {
        this.minute = minute >= 0 ? minute % 60 : minute > -60 ? (minute + 60) : Math.abs(minute) % 60;
    }

    public void setSecond(int second) {
        this.second = second >= 0 ? second % 60 : second > -60 ? (second + 60) : Math.abs(second) % 60;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond(){
        if(this.second + 1 < 60)
            return new MyTime(this.hour, this.minute, this.second + 1);
        else if(this.minute + 1 < 60)
            return new MyTime(this.hour, this.minute + 1, 0);
        else return new MyTime(this.hour + 1, 0, 0);
    }

    public MyTime nextMinute(){
        if(this.minute + 1 < 60)
            return new MyTime(this.hour, this.minute + 1, this.second);
        else return new MyTime(this.hour + 1, 0, this.second);
    }

    public MyTime nextHour(){
        return new MyTime(this.hour + 1, this.minute, this.second);
    }

    public MyTime previousSecond(){
        if(this.second > 0)
            return new MyTime(this.hour, this.minute, this.second - 1);
        else if(this.minute > 0)
            return new MyTime(this.hour, this.minute - 1, 59);
        else return new MyTime(this.hour - 1, 59, 59);
    }

    public MyTime previousMinute(){
        if(this.minute > 0)
            return new MyTime(this.hour, this.minute - 1, this.second);
        else return new MyTime(this.hour - 1, 59, this.second);
    }

    public MyTime previousHour(){
        return new MyTime(this.hour - 1, this.minute, this.second);
    }
}
