package sys.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

public class UpLoadController {

    @RequestMapping("/editMovieInfo")
    @ResponseBody
    public String editMovieInfo(@RequestParam("id")final int id,@RequestParam("file")MultipartFile file) {
//    int result = upLoadService.editMovieInfo(id,file,uploadDir);
//    if (result > -1) {
//    return JSON.toJSONString("true");
//    } else {
//    return JSON.toJSONString("false");
//    }
      return null;
    }
}
