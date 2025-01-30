package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseHttpExceptionClassTest {

    @Test
    public void parseHttpExceptionClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\":\"Error Message\"}";
        HttpException exception = transformer.parse(json, HttpException.class);
        assertNotNull(exception);
        assertEquals("Error Message", exception.getMessage());
    }

}