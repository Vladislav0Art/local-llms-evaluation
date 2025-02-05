package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseSuccessFullResponseTest() {
        String expectedProjectName = "TestProject";
        String json = "{\"name\":\"" + expectedProjectName + "\"}";

        Project result = jacksonJsonTransformer.parse(json, Project.class);

        Assert.assertEquals(expectedProjectName, result.getName());
    }

    @Test
    public void parseInvalidJsonStringTest() {
        String json = "Invalid Json String";

        jacksonJsonTransformer.parse(json, Project.class);
    }

    @Test
    public void convertSuccessFullResponseTest() {
        String expectedJson = "{\"name\":\"TestProject\"}";

        Project project = new Project();
        project.setName("TestProject");

        String result = jacksonJsonTransformer.convert(project);

        Assert.assertEquals(expectedJson, result);
    }

    @Test
    public void parseInvalidObjectTypeTest() {
        String json = "{\"name\":\"TestProject\"}";

        FileInfo result = jacksonJsonTransformer.parse(json, FileInfo.class);

        Assert.assertNull(result);
    }

    @Test
    public void convertNullObjectTest() {
        jacksonJsonTransformer.convert(null);
    }

}