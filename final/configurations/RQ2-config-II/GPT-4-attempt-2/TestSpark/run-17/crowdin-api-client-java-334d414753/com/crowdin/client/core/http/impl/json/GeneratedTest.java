package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        String json = "{\"name\":\"test project\"}";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        Project project = transformer.parse(json, Project.class);

        assertNotNull(project);
        assertEquals("test project", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        String json = "invalid json";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        transformer.parse(json, Project.class);
    }

    @Test
    public void parseNonExistingFieldJsonTest() {
        String json = "{\"non_existing_field\":\"value\"}";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        transformer.parse(json, Project.class);
    }

    @Test
    public void convertValidObjectTest() {
        Project project = new Project();
        project.setName("test project");
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        String json = transformer.convert(project);

        assertNotNull(json);
        assertTrue(json.contains("\"name\":\"test project\""));
    }

    @Test
    public void convertInvalidObjectTest() {
        FileInfo invalidObject = new FileInfo();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        transformer.convert(invalidObject);
    }

}