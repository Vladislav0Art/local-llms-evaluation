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

public class GeneratedParseLanguageTranslationsClassTest {

    // The instance of class under test
    JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseLanguageTranslationsClassTest() throws Exception {
        String json = "{\"languageId\":\"fr\",\"stringsCount\":15}";
        LanguageTranslations actual = transformer.parse(json, LanguageTranslations.class);
        assertNotNull(actual);
        assertEquals("fr", actual.getLanguageId());
        assertEquals(15, actual.getStringsCount());
    }

}