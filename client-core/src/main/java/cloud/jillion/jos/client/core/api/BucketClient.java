package cloud.jillion.jos.client.core.api;

import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import cloud.jillion.jos.client.core.model.request.BucketCreateReq;
import cloud.jillion.jos.client.core.model.request.BucketGetQry;
import cloud.jillion.jos.client.core.model.request.BucketListQry;
import cloud.jillion.jos.client.core.model.request.BucketUpdateReq;
import cloud.jillion.jos.client.core.model.response.BucketCO;

/**
 * @author leanderlee
 * @since 1.0.0
 */
public interface BucketClient {

    PageResponse<BucketCO> listBuckets(@Valid BucketListQry qry);

    Response createBucket(@Valid BucketCreateReq req);

    SingleResponse<BucketCO> getBucket(@Valid BucketGetQry qry);

    Response updateBucket(@Valid BucketUpdateReq req);

    Response removeBucket(@NotBlank String bucketName);
}
