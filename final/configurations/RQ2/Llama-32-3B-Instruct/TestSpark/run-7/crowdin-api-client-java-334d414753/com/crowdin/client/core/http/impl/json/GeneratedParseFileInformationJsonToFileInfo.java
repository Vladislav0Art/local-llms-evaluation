package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseFileInformationJsonToFileInfo {

    @Test
    public void parseFileInformationJsonToFileInfo() {
        String json = "{\"name\":\"FileName\",\"size\":1024,\"type\":\"FileType\"}";
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("FileName");
        fileInfo.setSize(1024);
        fileInfo.setType("FileType");

        ObjectMapper mapper = new ObjectMapper();

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo result = transformer.parse(json, FileInfo.class);
        assertEquals(fileInfo.getName(), result.getName());
        assertEquals(fileInfo.getSize(), result.getSize());
        assertEquals(fileInfo.getType(), result.getType());
    }

}