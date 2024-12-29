package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

public class GeneratedConvert_file_info_to_json {

    @Test
    public void convert_file_info_to_json() {
        FileInfo fileInfo = new FileInfo("test.txt", 1024L);
        String expected = "{\"fileName\":\"test.txt\",\"fileSize\":" + 1024 + "}";
        assertEquals(expected, JacksonJsonTransformer.convert(fileInfo).toString());
    }

}