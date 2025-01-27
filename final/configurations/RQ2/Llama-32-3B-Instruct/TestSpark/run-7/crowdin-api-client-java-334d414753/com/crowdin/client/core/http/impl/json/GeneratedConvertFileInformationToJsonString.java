package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertFileInformationToJsonString {

    @Test
    public void convertFileInformationToJsonString() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("FileName");
        fileInfo.setSize(1024);
        fileInfo.setType("FileType");

        ObjectMapper mapper = new ObjectMapper();

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String result = transformer.convert(fileInfo);
        assertEquals("{\"name\":\"FileName\",\"size\":1024,\"type\":\"FileType\"}", result);
    }

}