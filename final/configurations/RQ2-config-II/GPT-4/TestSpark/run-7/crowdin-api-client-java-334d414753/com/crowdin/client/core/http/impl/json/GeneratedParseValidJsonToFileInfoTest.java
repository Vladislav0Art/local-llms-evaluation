package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseValidJsonToFileInfoTest {

    @Test
    public void parseValidJsonToFileInfoTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"file.txt\",\"stringCount\":23}";
        FileInfo fileInfo = jacksonJsonTransformer.parse(json, FileInfo.class);

        assertEquals("file.txt", fileInfo.getName());
        assertEquals(23, fileInfo.getStringCount());
    }

}