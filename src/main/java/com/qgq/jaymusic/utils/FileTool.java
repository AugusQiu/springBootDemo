package com.qgq.jaymusic.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/***
 * 文件上传工具类
 * */
public class FileTool {
    public static void uploadFiles(byte[] file,String filePath,String fileName) throws Exception{
      File targetFile = new File(filePath);
      if(!targetFile.exists()){
          targetFile.mkdirs();
      }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    /**创建新的文件名**/
    public static String renameToUUID(String fileName) {
        return UUID.randomUUID() + "." + fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
