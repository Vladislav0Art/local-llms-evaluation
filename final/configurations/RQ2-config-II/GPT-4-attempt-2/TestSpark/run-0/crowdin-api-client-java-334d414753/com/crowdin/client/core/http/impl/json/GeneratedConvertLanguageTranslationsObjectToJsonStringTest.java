package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertLanguageTranslationsObjectToJsonStringTest {

    @Test
    public void convertLanguageTranslationsObjectToJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        LanguageTranslations translations = new LanguageTranslations();
        translations.setLanguageId("en");
        translations.setTranslations(Arrays.asList("translation1", "translation2"));

        String jsonData = transformer.convert(translations);

        Assert.assertNotNull(jsonData);
        Assert.assertTrue(jsonData.contains("\"languageId\":\"en\""));
        Assert.assertTrue(jsonData.contains("\"translations\":[\"translation1\",\"translation2\"]"));
    }

}