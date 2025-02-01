package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class GeneratedConvertTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertTest() throws IOException {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId("123");
        fileInfo.setPath("/test.txt");
        fileInfo.setProject_id("1234");
        String json = jacksonJsonTransformer.convert(fileInfo);

        assertNotNull(json);
        assertEquals("{\"id\":\"123\",\"path\":\"/test.txt\",\"project_id\":\"1234\"}", json);
    }

}