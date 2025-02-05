package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        LanguageTranslations translation = new LanguageTranslations();
        translation.setCrowdinLocaleCode("en");
        translation.setTranslationStrings(new ArrayList<>());

        String json = transformer.convert(translation);
        assertNotNull(json);
        assertEquals("{\"crowdinLocaleCode\":\"en\",\"translationStrings\":[]}", json);
    }

}