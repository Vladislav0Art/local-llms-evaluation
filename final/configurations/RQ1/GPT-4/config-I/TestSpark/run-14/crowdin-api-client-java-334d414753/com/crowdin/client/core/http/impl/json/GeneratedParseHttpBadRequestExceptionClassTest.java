package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseHttpBadRequestExceptionClassTest {

    @Test
    public void parseHttpBadRequestExceptionClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\":\"Error Message\"}";
        HttpBadRequestException exception = transformer.parse(json, HttpBadRequestException.class);
        assertNotNull(exception);
        assertEquals("Error Message", exception.getMessage());
    }

}