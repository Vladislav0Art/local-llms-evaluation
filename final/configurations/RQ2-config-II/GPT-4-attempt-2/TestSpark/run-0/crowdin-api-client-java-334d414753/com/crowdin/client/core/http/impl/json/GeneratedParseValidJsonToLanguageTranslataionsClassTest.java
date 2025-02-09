package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonToLanguageTranslataionsClassTest {

    @Test
    public void parseValidJsonToLanguageTranslataionsClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{ \"languageId\": \"en\", \"translations\": [\"translation1\", \"translation2\"] }";
        LanguageTranslations translations = transformer.parse(validJson, LanguageTranslations.class);

        Assert.assertNotNull(translations);
        Assert.assertEquals("en", translations.getLanguageId());
        Assert.assertEquals(2, translations.getTranslations().size());
        Assert.assertTrue(translations.getTranslations().contains("translation1"));
        Assert.assertTrue(translations.getTranslations().contains("translation2"));
    }

}