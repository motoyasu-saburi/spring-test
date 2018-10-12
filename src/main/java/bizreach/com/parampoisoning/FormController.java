package bizreach.com.parampoisoning;

import com.sun.javafx.binding.Logging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * Created by motoyasu.saburi on 2018/10/11.
 */
@Controller
public class FormController {

    static final Logger logger = Logger.getLogger(Logging.class.getName());

    @PostMapping("file/upload")
    public Object post(
            @RequestParam("freeText") @Nullable String freeText,
            @RequestParam("upload_file1") @Nullable MultipartFile upload_file1,
            @RequestParam("upload_file2") @Nullable MultipartFile upload_file2,
            @RequestParam("userName") @Nullable String userName
    )
    {

        logger.info("request-------------------------");
        logger.info("freeText: " + freeText);

        byte[] result1 = new byte[0];
        byte[] result2 = new byte[0];
//        try {
//            //result1 = upload_file1.getBytes();
//            //result2 = upload_file2.getBytes();
//            //logger.info("file1: " + new String(result1, "UTF-8"));
//            //logger.info("file2: " + new String(result2, "UTF-8"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        logger.info("userName: " + userName);
//        logger.info("fileName:" + multipartFile);
//        multipartFile1.map(s -> {
//            byte[] sssss = new byte[0];
//            String result = "";
//            try {
//                result = new String(sssss, "UTF-8");
//                sssss = s.getBytes();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            logger.info(result);
//            return sssss;
//        });
//        multipartFile2.map(s -> {
//            byte[] sssss = new byte[0];
//            String result = "";
//            try {
//                result = new String(sssss, "UTF-8");
//                sssss = s.getBytes();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            logger.info(result);
//            return sssss;
//        });
//        logger.info("userName:" + userName);
//        logger.info("freeText:" + freeText);

        return "true";
    }

}
