package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.crowdin.client.sourcefiles.model.FileInfo;

public class GeneratedConvertInvalidObjectTest {

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        LanguageTranslations languageTranslations = new LanguageTranslations(); //Required fields are not set

        String jsonString = transformer.convert(languageTranslations);
    }

}