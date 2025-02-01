package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class GeneratedParseHttpBadRequestExceptionTest {

    @Test
    public void parseHttpBadRequestExceptionTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String errorJson = "{\"statusCode\":400, \"message\": \"Invalid request\"}";
        HttpBadRequestException exception = transformer.parse(errorJson, HttpBadRequestException.class);
        Assert.assertEquals(400, exception.getStatusCode());
        Assert.assertEquals("Invalid request", exception.getMessage());
    }

}