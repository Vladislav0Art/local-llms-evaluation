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

public class GeneratedParseHttpExceptionClassTest {

    // The instance of class under test
    JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void ParseHttpExceptionClassTest() throws Exception {
        String json = "{\"message\":\"Bad Request\",\"statusCode\":400}";
        HttpException actual = transformer.parse(json, HttpException.class);
        assertNotNull(actual);
        assertEquals("Bad Request", actual.getMessage());
        assertEquals(400, actual.getStatusCode());
    }

}