package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParse JsonToFileInfoTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void parse

    JsonToFileInfoTest() {
        String json = "{\"name\":\"My File\",\"size\":123,\"path\":\"/my/file\"}";
        FileInfo fileInfo = objectMapper.readValue(json, FileInfo.class);
        assertEquals("My File", fileInfo.getName());
        assertEquals(123L, fileInfo.getSize());
        assertEquals("/my/file", fileInfo.getPath());
    }

}