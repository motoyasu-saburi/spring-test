package bizreach.com.parampoisoning;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import lombok.Data;

/**
 * Created by motoyasu.saburi on 2018/10/11.
 */
@Data
public class FormData {

    public MultipartFile multipartFile;
    public String userName;
    public String freeText;

}
