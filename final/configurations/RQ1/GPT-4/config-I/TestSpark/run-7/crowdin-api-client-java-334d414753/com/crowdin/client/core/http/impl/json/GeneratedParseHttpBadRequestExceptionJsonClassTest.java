package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseHttpBadRequestExceptionJsonClassTest {

    @Test
    public void parseHttpBadRequestExceptionJsonClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\":\"bad request exception message\"}";

        HttpBadRequestException exception = transformer.parse(json, HttpBadRequestException.class);

        assertNotNull(exception);
        assertEquals("bad request exception message", exception.getMessage());
    }

}