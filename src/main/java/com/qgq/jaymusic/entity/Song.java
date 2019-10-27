package com.qgq.jaymusic.entity;

public class Song {
    private String songid; //歌曲id
    private String songname;   //歌曲名称
    private String singer;  //演唱者
    private String coverurl; //封面地址
    private String playurl; //播放地址

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid;
    }

    public String getSongName() {
        return songname;
    }

    public void setSongName(String name) {
        this.songname = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCoverurl() {
        return coverurl;
    }

    public void setCoverurl(String coverurl) {
        this.coverurl = coverurl;
    }

    public String getPlayurl() {
        return playurl;
    }

    public void setPlayurl(String playurl) {
        this.playurl = playurl;
    }



}
