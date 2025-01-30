package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseJsonToHttpBadRequestExceptionTest {

    private final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseJsonToHttpBadRequestExceptionTest() throws IOException {
        String json = "{\"message\":\"Bad request\"}";
        HttpBadRequestException result = jacksonJsonTransformer.parse(json, HttpBadRequestException.class);
        Assert.assertEquals("Bad request", result.getMessage());
    }

}