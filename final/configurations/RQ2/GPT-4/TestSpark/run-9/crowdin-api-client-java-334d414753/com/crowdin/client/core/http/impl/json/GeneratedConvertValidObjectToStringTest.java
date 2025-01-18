package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertValidObjectToStringTest {

    @Test
    public void convertValidObjectToStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(Long.valueOf(1));
        fileInfo.setName("Test");
        String json = transformer.convert(fileInfo);
        Assert.assertEquals("{\"id\":1,\"name\":\"Test\"}", json);
    }

}