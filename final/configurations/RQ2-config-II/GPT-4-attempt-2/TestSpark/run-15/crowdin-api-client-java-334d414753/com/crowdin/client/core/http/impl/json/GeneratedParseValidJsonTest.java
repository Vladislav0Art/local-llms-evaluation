package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Test Project\"}";

        Project project = transformer.parse(json, Project.class);

        assertNotNull(project);
        assertEquals(1, project.getId());
        assertEquals("Test Project", project.getName());
    }

}