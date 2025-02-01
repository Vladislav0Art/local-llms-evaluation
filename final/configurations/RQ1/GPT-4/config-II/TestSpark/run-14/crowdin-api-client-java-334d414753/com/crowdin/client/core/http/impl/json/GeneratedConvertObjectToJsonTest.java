package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertObjectToJsonTest {

    // The instance of class under test
    JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertObjectToJsonTest() throws Exception {
        LanguageTranslations langTranslation = new LanguageTranslations();
        langTranslation.setLanguageId("fr");
        langTranslation.setStringsCount(15);

        String actualJson = transformer.convert(langTranslation);
        String expectedJson = "{\"languageId\":\"fr\",\"stringsCount\":15}";
        Assert.assertEquals(actualJson, expectedJson);
    }

}