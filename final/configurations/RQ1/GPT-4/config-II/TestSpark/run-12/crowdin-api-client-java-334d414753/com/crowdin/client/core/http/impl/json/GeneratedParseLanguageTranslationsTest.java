package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseLanguageTranslationsTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseLanguageTranslationsTest() throws Exception {
        String json = "{\"languageId\":1, \"translationsCount\":100}";
        LanguageTranslations result = jacksonJsonTransformer.parse(json, LanguageTranslations.class);
        assertNotNull(result);
        assertEquals(1, result.getLanguageId().intValue());
        assertEquals(100, result.getTranslationsCount().intValue());
    }

}