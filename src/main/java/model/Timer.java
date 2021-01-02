package model;

public class Timer
{
    private long start = 0;

    private long time = 0;

    public void start()
    {
        this.start = System.nanoTime();
    }

    public void stop()
    {
        this.time = Math.round((System.nanoTime() - this.start) * Math.pow(10, -6));
    }

    public long getTime()
    {
        return time;
    }
}
