package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedConvertLanguageTranslationsTest {

    @Test
    public void convertLanguageTranslationsTest() throws IOException {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        LanguageTranslations languageTranslations = new LanguageTranslations();
        languageTranslations.setLanguage("en");
        String result = jacksonJsonTransformer.convert(languageTranslations);
        Assert.assertTrue(result.contains("\"language\":\"en\""));
    }

}