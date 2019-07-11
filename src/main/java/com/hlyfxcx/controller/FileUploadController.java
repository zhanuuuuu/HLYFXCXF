package com.hlyfxcx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

@Controller
@ApiIgnore
public class FileUploadController {

    /*
     * 获取file.html页面
     */
    @RequestMapping(value = "file",method = RequestMethod.GET)
    public String file(){
        return "/file";
    }

    /**
     * 实现文件上传
     * */
    @RequestMapping(value = "fileUpload",method = RequestMethod.POST)
    @ResponseBody
    public String fileUpload(@RequestParam("fileName") MultipartFile file){
        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);

        String path = "F:/test" ;
        File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "true";
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }
     /*
     * 获取multifile.html页面
     */
    @RequestMapping(value = "multifile",method = RequestMethod.GET)
    public String multifile(){
        return "/multifile";
    }

    /**
     * 实现多文件上传
     * */
    @RequestMapping(value="multifileUpload",method= RequestMethod.POST)

    /**public @ResponseBody String multifileUpload(@RequestParam("fileName")List<MultipartFile> files) */
    public @ResponseBody
    String multifileUpload(HttpServletRequest request){

        String subject=request.getParameter("subject");
        String cSupNo=request.getParameter("cSupNo");
            System.out.println("cSupNo---------------------------------------------"+cSupNo);
            System.out.println("subject---------------------------------------------"+subject);
//        System.out.println("subject---------------------------------------------"+subject.replaceAll("=",""));
//        System.out.println("subject---------------------------------------------"+subject.replaceAll("=","").replaceAll("\\s*","").replaceAll("\\n",""));
//        System.out.println("subject---------------------------------------------"+subject.replaceAll("=","").replaceAll("\\s*","").replaceAll("\\n","").trim());
//
//        JSONArray jsonObject=JSONArray.fromObject(subject.replaceAll("=","").replaceAll("\\s*","").replaceAll("\\n","").trim());
//
//        System.out.println("subject---------------------------------------------"+jsonObject.toString());
        List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("fileName");
        if(files.isEmpty()){
            return "false";
        }
        String path = "C:/test" ;

        for(MultipartFile file:files){
            String fileName = file.getOriginalFilename();
            int size = (int) file.getSize();
            System.out.println(fileName + "-->" + size);
            if(file.isEmpty()){
                return "false";
            }else{
                //从命名
                String imageType=fileName.substring(fileName.indexOf("."),fileName.length());
                System.out.println(imageType);
               // File dest = new File(path + "/" + fileName);
                File dest = new File(path + "/" + System.currentTimeMillis()+imageType);
                if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
                    dest.getParentFile().mkdir();
                }
                try {
                    file.transferTo(dest);
                }catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return "false";
                }
            }
        }
        return "true";
    }

    @RequestMapping(value = "download",method = RequestMethod.GET)
    public String downLoad(HttpServletResponse response){
        String filename="A.png";
        String filePath = "C:/test" ;
        File file = new File(filePath + "/" + filename);
        if(file.exists()){ //判断文件父目录是否存在
            response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment;fileName=" + filename);
            byte[] buffer = new byte[1024];
            FileInputStream fis = null; //文件输入流
            BufferedInputStream bis = null;
            OutputStream os = null; //输出流
            try {
                os = response.getOutputStream();
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                int i = bis.read(buffer);
                while(i != -1){
                    os.write(buffer);
                    i = bis.read(buffer);
                }

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("----------file download" + filename);
            try {
                bis.close();
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return null;
    }
}
