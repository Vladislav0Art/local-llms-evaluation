package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNormalScenarioTest {

    @Test
    public void parseNormalScenarioTest() {
        String json = "{\"name\":\"Project1\",\"id\":1}";
        Class<Project> clazz = Project.class;
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();

        Project project = jsonTransformer.parse(json, clazz);

        Assert.assertEquals("Project1", project.getName());
        Assert.assertEquals(Long.valueOf(1), project.getId());
    }

}