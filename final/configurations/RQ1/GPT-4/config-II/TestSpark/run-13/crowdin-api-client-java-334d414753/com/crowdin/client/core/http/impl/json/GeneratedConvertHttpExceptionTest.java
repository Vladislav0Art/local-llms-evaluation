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

public class GeneratedConvertHttpExceptionTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertHttpExceptionTest() throws JsonProcessingException {
        HttpException exception = new HttpException("Error", 400);
        String result = jacksonJsonTransformer.convert(exception);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("\"message\":\"Error\""));
        Assert.assertTrue(result.contains("\"code\":400"));
    }

}