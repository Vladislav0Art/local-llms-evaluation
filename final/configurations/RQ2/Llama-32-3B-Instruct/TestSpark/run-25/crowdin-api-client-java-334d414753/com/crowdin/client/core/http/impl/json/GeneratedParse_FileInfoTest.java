package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedParse_FileInfoTest {

    @Test
    public void parse_FileInfoTest() {
        String json = "{\"name\":\"File1\",\"size\":1024,\"type\":\"pdf\"}";
        FileInfo fileInfo = JacksonJsonTransformer.parse(json, FileInfo.class);
        assertNotNull(fileInfo);
        assertEquals("File1", fileInfo.getName());
        assertEquals(1024L, fileInfo.getSize(), 0); // Due to float precision
        assertEquals("pdf", fileInfo.getType());
    }

}