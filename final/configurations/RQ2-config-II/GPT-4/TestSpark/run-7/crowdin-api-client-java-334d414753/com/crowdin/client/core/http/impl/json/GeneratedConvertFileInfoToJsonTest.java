package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedConvertFileInfoToJsonTest {

    @Test
    public void convertFileInfoToJsonTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("file.txt");
        fileInfo.setStringCount(23);

        String expectedJson = "{\"name\":\"file.txt\",\"stringCount\":23}";
        String actualJson = jacksonJsonTransformer.convert(fileInfo);

        Assert.assertEquals(expectedJson, actualJson);
    }

}