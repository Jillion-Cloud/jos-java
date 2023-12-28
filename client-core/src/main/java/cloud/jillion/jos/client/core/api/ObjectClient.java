package cloud.jillion.jos.client.core.api;

import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.dtflys.forest.annotation.NotNull;
import com.dtflys.forest.callback.OnProgress;
import jakarta.validation.Valid;
import cloud.jillion.jos.client.core.model.request.*;
import cloud.jillion.jos.client.core.model.response.ObjectContentCO;
import cloud.jillion.jos.client.core.model.response.ObjectInfoCO;
import cloud.jillion.jos.client.core.model.response.ObjectInfoListCO;
import cloud.jillion.jos.client.core.model.response.PresignedUrlCO;

import java.io.File;
import java.io.InputStream;

/**
 * @author leanderlee
 * @since 1.0.0
 */
public interface ObjectClient {

    PageResponse<ObjectInfoListCO> listObjects(@Valid ObjectListQry qry);

    Response putObject(@Valid ObjectPutReq req, @NotNull byte[] file, OnProgress progress);

    Response putObject(@Valid ObjectPutReq req, @NotNull InputStream stream, OnProgress progress);

    Response putObject(@Valid ObjectPutReq req, @NotNull File file, OnProgress progress);

    SingleResponse<ObjectInfoCO> getObject(@Valid ObjectGetQry qry);

    ObjectContentCO getObjectContent(@Valid ObjectGetQry qry) throws Exception;

    SingleResponse<PresignedUrlCO> getPresignedUrl(@Valid PresignedUrlGetQry qry);

    Response removeObject(@Valid ObjectRemoveReq req);
}
