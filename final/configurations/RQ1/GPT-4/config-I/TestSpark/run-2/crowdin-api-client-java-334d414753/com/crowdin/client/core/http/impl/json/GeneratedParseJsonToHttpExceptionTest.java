package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseJsonToHttpExceptionTest {

    private final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseJsonToHttpExceptionTest() throws IOException {
        String json = "{\"message\":\"Bad request\"}";
        HttpException result = jacksonJsonTransformer.parse(json, HttpException.class);
        Assert.assertEquals("Bad request", result.getMessage());
    }

}