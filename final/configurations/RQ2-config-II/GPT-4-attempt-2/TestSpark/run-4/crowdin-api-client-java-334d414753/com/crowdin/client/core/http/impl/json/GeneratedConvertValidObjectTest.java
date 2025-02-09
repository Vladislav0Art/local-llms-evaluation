package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("Test Project");
        project.setDescription("This is a test project");

        String json = transformer.convert(project);
        assertTrue(json.contains("\"name\":\"Test Project\""));
        assertTrue(json.contains("\"description\":\"This is a test project\""));
    }

}