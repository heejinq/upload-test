package mit.c301.nf4.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class UploadController {

   @GetMapping("/uploadForm")  // 사진 업로드를 위한 부분 ! 
   public void uploadForm() {
      
      log.info("upload form");
   }
   //여기까지 돌리면 [파일선택버튼]선택된 파일 없음, submit 버튼. 걍 uploadForm.jsp 뜸
   
   @PostMapping("/uploadFormAction")
   public void uploadFormPost(MultipartFile[] uploadFile, Model model) {
      
      String uploadFolder = "\\\\Yang\\학생용(쓰기가능)\\(확정)NF4\\공유폴더\\Test\\src\\main\\webapp\\resources\\test\\img";
      
      for (MultipartFile multipartFile : uploadFile) {
         
         log.info("---------------------------");
         log.info("Upload File Name: " +multipartFile.getOriginalFilename());   //업로드되는 파일의 이름
         log.info("Upload File size: " +multipartFile.getSize());            //파일의 크기
         
         File saveFile = new File(uploadFolder, multipartFile.getOriginalFilename());
         
         try {
            multipartFile.transferTo(saveFile); //업로드되는 파일을 저장하는 방법: transferTo()이용
         }catch(Exception e) {
            log.error(e.getMessage());
         }//end catch
      }//end for
   }
   //여기까지하면 \\Yang\학생용(쓰기가능)\(확정)NF4\공유폴더\Test\src\main\webapp\resources\test\img파일에 저장되어있음
   
//   @GetMapping("/uploadAjax")
//   public void uploadAjax() {
//      
//      log.info("upload ajax");
//   }
}