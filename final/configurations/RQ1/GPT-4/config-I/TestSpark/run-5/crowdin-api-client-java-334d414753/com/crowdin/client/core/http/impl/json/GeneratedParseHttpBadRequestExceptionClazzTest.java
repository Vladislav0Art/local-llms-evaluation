package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseHttpBadRequestExceptionClazzTest {

    @Test
    public void parseHttpBadRequestExceptionClazzTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        HttpBadRequestException exception = jacksonJsonTransformer.parse("{\"status\":\"400\",\"message\":\"Invalid request\"}", HttpBadRequestException.class);
        assertNotNull(exception);
        assertEquals("Invalid request", exception.getMessage());
    }

}