package com.mystery0.imystery0.BaseClass;


/**
 * Created by myste on 2016-6-4-0004.
 * 音乐类
 */
public class Music
{
    private long id;
    private String title;
    private String artist;
    private long duration;
    private long size;

    public void setId(long id){
        this.id = id;
    }

    public long getId(){return this.id;}

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){return this.title;}

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getArtist(){return this.artist;}

    public void setDuration(long duration){this.duration = duration;}

    public long getDuration(){return this.duration;}

    public void setSize(long size){this.size = size;}

    public long getSize(){return this.size;}

}
