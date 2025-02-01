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

public class GeneratedParseCrowdinApiExceptionClassTest {

    // The instance of class under test
    JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseCrowdinApiExceptionClassTest() throws Exception {
        String json = "{\"errorCode\":\"404\",\"message\":\"Not Found\"}";
        transformer.parse(json, CrowdinApiException.class);
    }

}