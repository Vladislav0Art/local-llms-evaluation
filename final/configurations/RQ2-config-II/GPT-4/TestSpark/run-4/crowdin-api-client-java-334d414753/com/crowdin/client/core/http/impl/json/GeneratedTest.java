package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"id\":1,\"name\":\"Test project\"}";
        Project project = transformer.parse(validJson, Project.class);
        assertNotNull(project);
        assertEquals((Integer) 1, project.getId());
        assertEquals("Test project", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidJson = "{\"id\"1\"name\"\"Test project\"}";
        transformer.parse(invalidJson, Project.class);
    }

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

    @Test
    public void convertNullObjectTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

    @Test
    public void convertDifferentObjectTypeTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ExportOptions options = new ExportOptions();
        options.setSkipUntranslatedStrings(true);
        options.setExportApprovedOnly(true);

        String json = transformer.convert(options);
        assertNotNull(json);
        assertEquals("{\"exportApprovedOnly\":true,\"skipUntranslatedStrings\":true}", json);
    }

}