package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseHttpExceptionClassTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpExceptionClassTest() throws JsonProcessingException {
        String json = "{\"message\":\"Http exception message\",\"code\":400}";
        HttpException exception = transformer.parse(json, HttpException.class);

        Assert.assertEquals("Http exception message", exception.getMessage());
        Assert.assertEquals(400, exception.getCode());
    }

}