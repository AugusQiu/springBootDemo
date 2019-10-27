package com.qgq.jaymusic.controller;

import com.qgq.jaymusic.entity.Song;
import com.qgq.jaymusic.service.SongService;
import com.qgq.jaymusic.utils.FileTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/music")
public class songController {
     @Autowired
     private SongService songService;

    @Value("${web.coverPath}")
    private String coverPath;

    @Value("${web.musicPath}")
    private String musicPath;

//     @RequestMapping("getSong/{id}")
//     public String getSong(@PathVariable String id){
//         return songService.getSongById(id).toString();
//     }
    @RequestMapping(value = "/songs",method = RequestMethod.POST)
    public List<Song> getSongsByName(@RequestParam("songname") String songname){
        return songService.getSongsByName(songname);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public int upload(@RequestParam("songname") String  songname,
                      @RequestParam("singer") String singer,
                      @RequestParam(value = "cover")MultipartFile cover,
                      @RequestParam(value = "music")MultipartFile music){

        Map<String, Object> map = new HashMap<>();

        String coverName = cover.getOriginalFilename(); //获取原始文件名
        coverName      = FileTool.renameToUUID(coverName); //生成新文件名

        String musicName = music.getOriginalFilename();
        musicName      = FileTool.renameToUUID(musicName);

        String songid = musicName.substring(0,6);

        try{
            FileTool.uploadFiles(cover.getBytes(),coverPath,coverName);
            FileTool.uploadFiles(cover.getBytes(),musicPath,musicName);

        }catch (Exception e) {
        }
        Song song = new Song();
        song.setSongid(songid);
        song.setSongName(songname);
        song.setSinger(singer);
        song.setCoverurl("static/covers/"+coverName);
        song.setPlayurl("static/musics/"+musicName);
        return songService.insertSong(song);
    }

}

