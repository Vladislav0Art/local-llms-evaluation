package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonToProjectClassTest {

    @Test
    public void parseValidJsonToProjectClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{ \"name\": \"test_project\", \"id\": 1 }";
        Project project = transformer.parse(validJson, Project.class);

        Assert.assertNotNull(project);
        Assert.assertEquals("test_project", project.getName());
        Assert.assertEquals((Integer) 1, project.getId());
    }

}