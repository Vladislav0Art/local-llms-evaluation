package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedConvertLanguageTranslationsToJsonTest {

    private static final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertLanguageTranslationsToJsonTest() {
        LanguageTranslations translations = new LanguageTranslations();
        translations.setLanguageId("en");

        String result = jacksonJsonTransformer.convert(translations);

        assertTrue(result.contains("\"languageId\":\"en\""));
    }

}