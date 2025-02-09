package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"Test Project\",\"description\":\"This is a test project\"}";
        Project project = transformer.parse(json, Project.class);

        assertEquals("Test Project", project.getName());
        assertEquals("This is a test project", project.getDescription());
    }

}