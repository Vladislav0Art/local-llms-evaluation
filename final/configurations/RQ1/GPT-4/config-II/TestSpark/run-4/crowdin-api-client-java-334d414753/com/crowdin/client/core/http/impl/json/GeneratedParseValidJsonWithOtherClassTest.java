package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class GeneratedParseValidJsonWithOtherClassTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseValidJsonWithOtherClassTest() throws IOException {
        String json = "{\"id\":\"123\",\"path\":\"/test.txt\",\"project_id\":\"1234\",\"branch_id\":null,\"directory_id\":\"4321\",\"name\":\"test\",\"title\":\"Test File\",\"created_at\":\"2021-08-26T09:18:21+00:00\",\"updated_at\":\"2021-08-26T09:18:21+00:00\"}";
        FileInfo fileInfo = jacksonJsonTransformer.parse(json, FileInfo.class);

        assertNotNull(fileInfo);
        assertEquals("123", fileInfo.getId());
        assertEquals("/test.txt", fileInfo.getPath());
    }

}