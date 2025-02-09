package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertValidObjectTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertValidObjectTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(1);
        fileInfo.setName("foo.txt");

        String json = transformer.convert(fileInfo);
        Assert.assertEquals("{\"id\":1,\"name\":\"foo.txt\"}", json);
    }

}