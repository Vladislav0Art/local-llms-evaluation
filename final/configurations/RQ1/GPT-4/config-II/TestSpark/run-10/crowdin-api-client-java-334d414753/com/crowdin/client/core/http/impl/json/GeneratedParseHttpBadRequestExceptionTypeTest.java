package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseHttpBadRequestExceptionTypeTest {

    @Test
    public void parseHttpBadRequestExceptionTypeTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String jsonException = "{\"message\" : \"some bad request exception\"}";

        HttpBadRequestException resultException = transformer.parse(jsonException, HttpBadRequestException.class);
        Assert.assertEquals("some bad request exception", resultException.getMessage());
    }

}