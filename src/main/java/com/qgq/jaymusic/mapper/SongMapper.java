package com.qgq.jaymusic.mapper;

import com.qgq.jaymusic.entity.Song;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SongMapper {
//     Song getSongById(String id);
     int insertSong(Song song);
     List<Song> getSongsByName(String songname);
}
