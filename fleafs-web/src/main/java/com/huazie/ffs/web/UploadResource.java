package com.huazie.ffs.web;

import com.huazie.frame.jersey.api.data.RequestBusinessData;
import com.huazie.frame.jersey.api.data.ResponseBusinessData;
import com.huazie.frame.jersey.api.resource.FleaJerseyPostResource;

import javax.ws.rs.Path;

/**
 * <p> 文件上传资源类 </p>
 *
 * @author huazie
 * @version 1.0.0
 * @since 1.0.0
 */
@Path("upload")
public class UploadResource extends FleaJerseyPostResource {

    @Override
    protected ResponseBusinessData doPost(RequestBusinessData requestBusinessData) throws Exception {

        return null;
    }
}
