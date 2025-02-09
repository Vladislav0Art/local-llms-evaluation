package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseInvalidJsonToProjectClassTest {

    @Test
    public void parseInvalidJsonToProjectClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidJson = "{ {";
        transformer.parse(invalidJson, Project.class);
    }

}