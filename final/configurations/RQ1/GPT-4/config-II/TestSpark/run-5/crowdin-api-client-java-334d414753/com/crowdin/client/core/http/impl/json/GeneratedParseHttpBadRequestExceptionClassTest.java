package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseHttpBadRequestExceptionClassTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpBadRequestExceptionClassTest() throws Exception {
        HttpBadRequestException httpBadRequestException = jacksonJsonTransformer.parse("{\"message\":\"Test message\"}", HttpBadRequestException.class);
        assertNotNull(httpBadRequestException);
        assertEquals("Test message", httpBadRequestException.getMessage());
    }

}