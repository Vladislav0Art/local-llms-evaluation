package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseHttpExceptionTest {

    @Test
    public void parseHttpExceptionTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\": \"An error occurred\"}";
        HttpException exception = transformer.parse(json, HttpException.class);

        assertNotNull(exception);
        assertTrue(exception instanceof HttpException);
        assertEquals("An error occurred", exception.getMessage());
    }

}