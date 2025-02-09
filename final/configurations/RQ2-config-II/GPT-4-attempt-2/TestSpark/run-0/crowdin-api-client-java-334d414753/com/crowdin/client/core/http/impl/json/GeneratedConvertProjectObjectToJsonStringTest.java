package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertProjectObjectToJsonStringTest {

    @Test
    public void convertProjectObjectToJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("test_project");
        project.setId(1);

        String jsonData = transformer.convert(project);

        Assert.assertNotNull(jsonData);
        Assert.assertTrue(jsonData.contains("\"name\":\"test_project\""));
        Assert.assertTrue(jsonData.contains("\"id\":1"));
    }

}