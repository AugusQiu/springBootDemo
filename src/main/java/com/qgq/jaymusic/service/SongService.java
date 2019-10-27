package com.qgq.jaymusic.service;

import com.qgq.jaymusic.entity.Song;
import com.qgq.jaymusic.mapper.SongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SongService implements SongMapper {
    @Autowired
    private SongMapper songMapper;

    @Override
    public int insertSong(Song song){
        return  songMapper.insertSong(song);
    }

    //根据歌曲名查询歌曲
    public List<Song> getSongsByName(String name){return songMapper.getSongsByName(name);}
////    根据id查询歌曲
//    public Song getSongById(String songId){
//        return SongMapper.getSongById(songId);
//    }
}
