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
public class GeneratedParseLanguageTranslationsTest {

    @Test
    public void parseLanguageTranslationsTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"language\":\"en\",\"strings\":{\"id1\":{\"text\":\"hello\",\"plural\":\"\"}}}";

        LanguageTranslations translations = transformer.parse(json, LanguageTranslations.class);
        assertNotNull(translations);
        assertEquals("en", translations.getLanguage());
        assertNotNull(translations.getStrings());
        assertEquals("hello", translations.getStrings().get("id1").getText());
    }

}