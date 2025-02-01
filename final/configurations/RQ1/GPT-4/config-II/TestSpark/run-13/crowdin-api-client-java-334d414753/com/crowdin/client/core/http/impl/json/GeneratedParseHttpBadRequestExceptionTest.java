package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseHttpBadRequestExceptionTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpBadRequestExceptionTest() throws IOException {
        String json = "{\"message\":\"Bad Request\",\"code\":400}";
        HttpBadRequestException result = jacksonJsonTransformer.parse(json, HttpBadRequestException.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(400, result.getCode());
        Assert.assertEquals("Bad Request", result.getMessage());
    }

}