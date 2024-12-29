package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

public class GeneratedParse_json_to_file_info {

    @Test
    public void parse_json_to_file_info() {
        String json = "{\"fileName\":\"test.txt\",\"fileSize\":1024}";
        FileInfo expected = new FileInfo("test.txt", 1024L);
        assertEquals(expected, JacksonJsonTransformer.parse(json, FileInfo.class));
    }

}