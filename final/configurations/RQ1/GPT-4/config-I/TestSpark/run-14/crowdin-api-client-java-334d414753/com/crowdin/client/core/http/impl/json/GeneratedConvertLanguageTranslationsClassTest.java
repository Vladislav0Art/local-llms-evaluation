package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertLanguageTranslationsClassTest {

    @Test
    public void convertLanguageTranslationsClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        LanguageTranslations translations = new LanguageTranslations();
        translations.setLanguageId(1L);
        translations.setTranslation("Test Translation");
        String json = transformer.convert(translations);
        assertNotNull(json);
        assertEquals("{\"languageId\":1,\"translation\":\"Test Translation\"}", json);
    }

}