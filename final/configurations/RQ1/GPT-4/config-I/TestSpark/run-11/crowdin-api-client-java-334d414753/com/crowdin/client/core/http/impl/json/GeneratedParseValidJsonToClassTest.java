package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseValidJsonToClassTest {

    @Test
    public void parseValidJsonToClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\": 1, \"name\": \"Test\"}";
        Project project = transformer.parse(json, Project.class);

        assertNotNull(project);
        //assuming setId() and getId() return and accept a Long
        assertEquals(Long.valueOf(1), project.getId());
        assertEquals("Test", project.getName());
    }

}