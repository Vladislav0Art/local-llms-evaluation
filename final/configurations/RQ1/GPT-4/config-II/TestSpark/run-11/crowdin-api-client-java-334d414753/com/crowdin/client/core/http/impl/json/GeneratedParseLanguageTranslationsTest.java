package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class GeneratedParseLanguageTranslationsTest {

    @Test
    public void parseLanguageTranslationsTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String langsJson = "{\"languageId\":\"en\", \"translations\": {\"key\": \"value\"}}";
        LanguageTranslations translations = transformer.parse(langsJson, LanguageTranslations.class);
        Assert.assertEquals("en", translations.getLanguageId());
        Assert.assertEquals("value", translations.getTranslations().get("key"));
    }

}