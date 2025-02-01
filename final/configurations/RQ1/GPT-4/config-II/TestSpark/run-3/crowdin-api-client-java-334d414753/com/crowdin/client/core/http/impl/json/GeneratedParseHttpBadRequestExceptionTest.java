package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseHttpBadRequestExceptionTest {

    @Test
    public void parseHttpBadRequestExceptionTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"error\":{\"code\":400,\"message\":\"Bad Request\"}}";
        HttpBadRequestException exception = transformer.parse(json, HttpBadRequestException.class);
        assertEquals(400, exception.getError().getCode());
        assertEquals("Bad Request", exception.getError().getMessage());
    }

}