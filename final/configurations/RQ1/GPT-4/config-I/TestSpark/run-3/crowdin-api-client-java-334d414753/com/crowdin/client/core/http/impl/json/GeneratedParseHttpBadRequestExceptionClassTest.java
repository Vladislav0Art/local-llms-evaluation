package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseHttpBadRequestExceptionClassTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpBadRequestExceptionClassTest() throws JsonProcessingException {
        String json = "{\"message\":\"Http bad request exception message\",\"code\":400}";
        HttpBadRequestException exception = transformer.parse(json, HttpBadRequestException.class);

        Assert.assertEquals("Http bad request exception message", exception.getMessage());
        Assert.assertEquals(400, exception.getCode());
    }

}