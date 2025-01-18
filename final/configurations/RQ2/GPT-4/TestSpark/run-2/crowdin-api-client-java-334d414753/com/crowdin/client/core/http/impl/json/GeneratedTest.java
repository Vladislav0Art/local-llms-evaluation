package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{ \"id\": 1, \"name\": \"Instance\" }";

        Project project = transformer.parse(json, Project.class);

        Assert.assertEquals(Long.valueOf(1), project.getId());
        Assert.assertEquals("Instance", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{ \"invalid\": 1, \"data\": \"Instance\" }";

        transformer.parse(json, Project.class);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(Long.valueOf(5));
        project.setName("test");

        String json = transformer.convert(project);

        Assert.assertTrue(json.contains("\"id\":5"));
        Assert.assertTrue(json.contains("\"name\":\"test\""));
    }

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();

        transformer.convert(fileInfo);
    }

}