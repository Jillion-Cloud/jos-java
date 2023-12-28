package cloud.jillion.jos.client.core.rest;

import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.dtflys.forest.annotation.*;
import cloud.jillion.jos.client.core.model.request.BucketCreateReq;
import cloud.jillion.jos.client.core.model.request.BucketGetQry;
import cloud.jillion.jos.client.core.model.request.BucketListQry;
import cloud.jillion.jos.client.core.model.request.BucketUpdateReq;
import cloud.jillion.jos.client.core.model.response.BucketCO;

/**
 * @author leanderlee
 * @since 1.0.0
 */
@BaseRequest(
        baseURL = "${serverUrl}/v1/api/buckets",
        headers = {
                "X-Access-Key: ${accessKey}",
                "X-Access-Secret: ${accessSecret}"
        }
)
public interface BucketRestClient {

    @Get(value = "/listBuckets")
    PageResponse<BucketCO> listBuckets(@Query BucketListQry qry);

    @Post(value = "/createBucket")
    Response createBucket(@JSONBody BucketCreateReq req);

    @Get(value = "/getBucket")
    SingleResponse<BucketCO> getBucket(@Query BucketGetQry qry);

    @Put(value = "/updateBucket")
    Response updateBucket(@Query BucketUpdateReq req);

    @Delete(value = "/removeBucket")
    Response removeBucket(@Var("bucketName") String bucketName);
}
