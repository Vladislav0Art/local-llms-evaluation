package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConvertLanguageTranslationsTest {

    @Test
    public void convertLanguageTranslationsTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        LanguageTranslations languageTranslations = new LanguageTranslations();
        languageTranslations.setLanguageId("1");
        String json = transformer.convert(languageTranslations);
        assertTrue(json.contains("1"));
    }

}