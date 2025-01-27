package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFileInfoToFileInfoTest {

    @Mock
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @Test
    public void parseFileInfoToFileInfoTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(3L);
        fileInfo.setFileFormat(4L);
        fileInfo.setProjectId(5L);
        String json = (String) com.fasterxml.jackson.databind.JsonNode.toJson(fileInfo);

        assertTrue(JsonTransformer.parse(json, FileInfo.class) instanceof FileInfo);
    }

}