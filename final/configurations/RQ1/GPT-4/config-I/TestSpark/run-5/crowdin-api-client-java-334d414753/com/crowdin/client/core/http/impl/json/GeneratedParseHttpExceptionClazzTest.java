package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseHttpExceptionClazzTest {

    @Test
    public void parseHttpExceptionClazzTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        HttpException exception = jacksonJsonTransformer.parse("{\"status\":\"500\",\"message\":\"Internal server error\"}", HttpException.class);
        assertNotNull(exception);
        assertEquals("Internal server error", exception.getMessage());
    }

}