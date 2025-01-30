package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseHttpBadRequestExceptionTest {

    @Test
    public void parseHttpBadRequestExceptionTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"errorMessage\":\"Bad request\"}";

        HttpBadRequestException ex = transformer.parse(json, HttpBadRequestException.class);
        assertNotNull(ex);
    }

}