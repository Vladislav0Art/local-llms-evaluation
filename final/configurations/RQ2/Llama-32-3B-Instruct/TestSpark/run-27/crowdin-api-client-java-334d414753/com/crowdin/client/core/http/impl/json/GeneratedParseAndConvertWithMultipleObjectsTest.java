package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseAndConvertWithMultipleObjectsTest {

    @Test
    public void parseAndConvertWithMultipleObjectsTest() throws Exception {
        JacksonJsonTransformer instance = new JacksonJsonTransformer();
        String jsonStr = "{\"project\":{\"id\":1,\"name\":\"crowdin\",\"created_at\":\"2010-10-29T00:00:00Z\"},\"sourceFiles\":[{\"id\":1,\"name\":\"test.txt\",\"size\":100,\"type\":\"txt\"}]}";
        FileInfo[] sourceFiles = (FileInfo[]) instance.parse(jsonStr, FileInfo[].class);
        assertNotNull(sourceFiles);
        assertEquals(1, sourceFiles.length);
    }

}