package handlatter.domain.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class SaveLetterRequest {
    MultipartFile image;
}
