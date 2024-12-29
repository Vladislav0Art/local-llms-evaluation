package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1L);
        project.setName("Test Project");

        String jsonString = transformer.convert(project);
        Assert.assertNotNull(jsonString);
        Assert.assertTrue(jsonString.contains("\"id\":1"));
        Assert.assertTrue(jsonString.contains("\"name\":\"Test Project\""));
    }

}