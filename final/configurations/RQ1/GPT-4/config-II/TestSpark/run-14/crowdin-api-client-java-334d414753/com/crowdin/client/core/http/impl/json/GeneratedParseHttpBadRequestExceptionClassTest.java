package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseHttpBadRequestExceptionClassTest {

    // The instance of class under test
    JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpBadRequestExceptionClassTest() throws Exception {
        String json = "{\"message\":\"Bad Request\",\"statusCode\":400}";
        HttpBadRequestException actual = transformer.parse(json, HttpBadRequestException.class);
        assertNotNull(actual);
        assertEquals("Bad Request", actual.getMessage());
        assertEquals(400, actual.getStatusCode());
    }

}