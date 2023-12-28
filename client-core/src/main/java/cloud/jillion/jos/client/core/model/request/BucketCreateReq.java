package cloud.jillion.jos.client.core.model.request;

import com.alibaba.cola.dto.Command;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

/**
 * @author leanderlee
 * @since 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BucketCreateReq extends Command {

    @NotBlank
    private String bucketName;

    @Min(10)
    private Integer quotaSize;

    private String encryptionType;
}
