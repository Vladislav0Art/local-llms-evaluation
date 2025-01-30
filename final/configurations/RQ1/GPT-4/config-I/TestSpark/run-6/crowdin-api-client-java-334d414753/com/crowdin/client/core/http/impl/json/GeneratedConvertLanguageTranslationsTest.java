package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertLanguageTranslationsTest {

    @Test
    public void convertLanguageTranslationsTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        LanguageTranslations translations = new LanguageTranslations();
        translations.setLanguage("en");
        translations.getStrings().put("id1", new LanguageTranslations.StringTranslation("hello", ""));

        String json = transformer.convert(translations);
        assertEquals("{\"language\":\"en\",\"strings\":{\"id1\":{\"text\":\"hello\",\"plural\":\"\"}}}", json);
    }

}