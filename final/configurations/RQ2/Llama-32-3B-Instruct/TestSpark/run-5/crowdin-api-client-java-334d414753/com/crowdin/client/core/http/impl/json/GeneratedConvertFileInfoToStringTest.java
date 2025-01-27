package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertFileInfoToStringTest {

    @Mock
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @Test
    public void convertFileInfoToStringTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(3L);
        fileInfo.setFileFormat(4L);
        fileInfo.setProjectId(5L);

        String result = (String) JsonTransformer.convert(fileInfo);

        assertFalse(result.isEmpty());
    }

}