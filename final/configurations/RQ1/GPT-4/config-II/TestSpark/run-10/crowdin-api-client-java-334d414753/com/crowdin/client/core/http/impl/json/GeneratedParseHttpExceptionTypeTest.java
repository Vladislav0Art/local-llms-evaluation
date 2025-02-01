package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseHttpExceptionTypeTest {

    @Test
    public void parseHttpExceptionTypeTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String jsonException = "{\"message\" : \"some exception\"}";

        HttpException resultException = transformer.parse(jsonException, HttpException.class);
        Assert.assertEquals("some exception", resultException.getMessage());
    }

}