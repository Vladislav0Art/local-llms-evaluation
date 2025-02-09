package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        Project project = new Project();
        project.setId(1L);
        project.setName("Test Project");
        project.setDescription("This is a test project");

        String expectedJson =
                "{" +
                        "\"id\":1," +
                        "\"name\":\"Test Project\"," +
                        "\"description\":\"This is a test project\"" +
                        "}";
        String actualJson = transformer.convert(project);

        Assert.assertEquals(expectedJson, actualJson);
    }

}