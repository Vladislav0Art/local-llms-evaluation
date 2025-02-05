package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void parseValidJsonTest() throws Exception {
        // Given
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Test Project\"}";

        // When
        Project project = transformer.parse(json, Project.class);

        // Then
        assertNotNull(project);
        assertEquals(1L, project.getId().longValue());
        assertEquals("Test Project", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() throws Exception {
        // Given
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "invalid json";

        // When
        FileInfo fileInfo = transformer.parse(json, FileInfo.class);

        // Then
        // Expect CrowdinApiException
    }

    @Test
    public void parseInvalidClassTest() throws Exception {
        // Given
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Test File\"}";

        // When
        Project project = transformer.parse(json, Project.class);

        // Then
        // Expect HttpBadRequestException
    }

    @Test
    public void convertValidObjectTest() throws Exception {
        // Given
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1L);
        project.setName("Test Project");

        // When
        String json = transformer.convert(project);

        // Then
        assertEquals("{\"id\":1,\"name\":\"Test Project\"}", json);
    }

    @Test
    public void convertInvalidObjectTest() throws Exception {
        // Given
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidObject = "invalid object";

        // When
        String json = transformer.convert(invalidObject);

        // Then
        // Expect HttpException
    }

}