package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId("1");
        project.setName("Test Project");
        try {
            String json = transformer.convert(project);
            assertNotNull(json);
            assertTrue(json.contains("\"id\":\"1\""));
            assertTrue(json.contains("\"name\":\"Test Project\""));
        } catch (Exception e) {
            fail("Exception should not have been thrown.");
        }
    }

}