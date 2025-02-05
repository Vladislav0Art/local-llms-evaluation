package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void parseValidJsonToFileInfoTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"file.txt\",\"stringCount\":23}";
        FileInfo fileInfo = jacksonJsonTransformer.parse(json, FileInfo.class);

        assertEquals("file.txt", fileInfo.getName());
        assertEquals(23, fileInfo.getStringCount());
    }

    @Test
    public void parseInvalidJsonToFileInfoTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"incompleteJson\":}";
        jacksonJsonTransformer.parse(json, FileInfo.class);
    }

    @Test
    public void convertFileInfoToJsonTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("file.txt");
        fileInfo.setStringCount(23);

        String expectedJson = "{\"name\":\"file.txt\",\"stringCount\":23}";
        String actualJson = jacksonJsonTransformer.convert(fileInfo);

        Assert.assertEquals(expectedJson, actualJson);
    }

}