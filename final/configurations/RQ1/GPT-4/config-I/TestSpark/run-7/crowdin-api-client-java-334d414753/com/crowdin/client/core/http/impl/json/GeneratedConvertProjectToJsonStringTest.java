package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertProjectToJsonStringTest {

    @Test
    public void convertProjectToJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(2L);
        project.setName("Test project");

        String json = transformer.convert(project);

        assertNotNull(json);
        assertTrue(json.contains(project.getName()));
        assertTrue(json.contains(String.valueOf(project.getId())));
    }

}