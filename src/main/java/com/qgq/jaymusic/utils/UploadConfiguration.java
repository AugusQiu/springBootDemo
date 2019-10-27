package com.qgq.jaymusic.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class UploadConfiguration extends WebMvcConfigurerAdapter {

    @Value("${web.coverPath}")
    private String coverPath;

    @Value("${web.musicPath}")
    private String musicPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/covers/**").addResourceLocations("file:"+coverPath);
        registry.addResourceHandler("/static/musics/**").addResourceLocations("file:"+musicPath);

        //阿里云(映射路径去除盘符)
        //registry.addResourceHandler("/ueditor/image/**").addResourceLocations("/upload/image/");
    }
}
