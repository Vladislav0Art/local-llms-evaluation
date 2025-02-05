package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertProjectToValidJsonStringTest {

    private JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertProjectToValidJsonStringTest() {
        Project project = new Project();
        project.setId(1L);
        project.setName("Test project");
        project.setDescription("TDD project");

        String jsonString = jsonTransformer.convert(project);

        assertEquals("{\"id\":1,\"name\":\"Test project\",\"description\":\"TDD project\"}", jsonString);
    }

}