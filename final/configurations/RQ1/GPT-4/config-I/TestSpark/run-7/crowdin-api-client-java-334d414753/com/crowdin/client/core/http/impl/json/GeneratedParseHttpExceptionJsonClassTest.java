package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseHttpExceptionJsonClassTest {

    @Test
    public void parseHttpExceptionJsonClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\":\"exception message\"}";

        HttpException exception = transformer.parse(json, HttpException.class);

        assertNotNull(exception);
        assertEquals("exception message", exception.getMessage());
    }

}