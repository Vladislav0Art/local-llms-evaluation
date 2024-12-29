package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "{\"id\":1,\"name\":\"Test Project\"}";
        Project project = jsonTransformer.parse(jsonString, Project.class);

        Assert.assertEquals(1L, (long) project.getId());
        Assert.assertEquals("Test Project", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String invalidJsonString = "{Invalid Json String}";
        jsonTransformer.parse(invalidJsonString, Project.class);
    }

    @Test
    public void parseNullJsonTest() {
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();
        jsonTransformer.parse(null, Project.class);
    }

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

    @Test
    public void convertNullObjectTest() {
        JsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

}