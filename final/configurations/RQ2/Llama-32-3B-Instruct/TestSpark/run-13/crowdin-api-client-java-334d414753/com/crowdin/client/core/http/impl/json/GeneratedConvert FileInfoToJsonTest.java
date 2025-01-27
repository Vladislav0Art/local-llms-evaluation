package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedConvert FileInfoToJsonTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void convert

    FileInfoToJsonTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("My File");
        fileInfo.setSize(123L);
        fileInfo.setPath("/my/file");

        String json = objectMapper.writeValueAsString(fileInfo);
        assertEquals("{\"name\":\"My File\",\"size\":123,\"path\":\"/my/file\"}", json);
    }

}