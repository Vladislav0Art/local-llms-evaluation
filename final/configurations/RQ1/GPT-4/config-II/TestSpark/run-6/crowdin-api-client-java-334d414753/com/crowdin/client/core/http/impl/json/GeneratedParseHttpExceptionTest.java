package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseHttpExceptionTest {

    @Test
    public void parseHttpExceptionTest() throws IOException {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"description\":\"Bad Request\",\"errors\":[{\"code\":\"BadRequest\"}]";
        jacksonJsonTransformer.parse(json, HttpException.class);
    }

}