package cloud.jillion.jos.client.core.model.request;

import com.alibaba.cola.dto.Query;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author leanderlee
 * @since 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class PresignedUrlGetQry extends Query {

    @NotBlank
    private String bucketName;

    @NotBlank
    private String objectPath;

    @NotBlank
    private String method;

    private Integer expires;

    private Integer availableTimes;
}
