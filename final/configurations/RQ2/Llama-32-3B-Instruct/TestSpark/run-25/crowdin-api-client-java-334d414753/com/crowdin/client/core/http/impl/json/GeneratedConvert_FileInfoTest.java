package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedConvert_FileInfoTest {

    @Test
    public void convert_FileInfoTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("File1");
        fileInfo.setSize(new Date().getTime()); // Use date to avoid float precision issues
        fileInfo.setType("pdf");
        String json = JacksonJsonTransformer.convert(fileInfo);
        assertNotNull(json);
        assertTrue(json.contains("\"name\":\"File1\""));
        assertTrue(json.contains("\"size\":"));
        assertTrue(json.contains("\"type\":\"pdf\""));
    }

}