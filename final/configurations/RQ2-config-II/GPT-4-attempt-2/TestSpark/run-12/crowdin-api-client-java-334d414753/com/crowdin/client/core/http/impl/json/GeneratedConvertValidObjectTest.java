package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1);
        project.setName("Test Project");

        String json = transformer.convert(project);

        Assert.assertTrue(json.contains("\"id\":1"));
        Assert.assertTrue(json.contains("\"name\":\"Test Project\""));
    }

}