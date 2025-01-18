package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertNormalScenarioTest {

    @Test
    public void convertNormalScenarioTest() {
        Project project = new Project();
        project.setName("Project1");
        project.setId(Long.valueOf(1));
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();

        String json = jsonTransformer.convert(project);

        Assert.assertEquals("{\"name\":\"Project1\",\"id\":1}", json);
    }

}