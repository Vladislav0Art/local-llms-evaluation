package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.InvocationTargetException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String jsonString = "{\"name\":\"Test project\",\"id\":1001}";
        Project project = transformer.parse(jsonString, Project.class);
        Assert.assertEquals("Test project", project.getName());
        Assert.assertEquals(1001, project.getId());
    }

}