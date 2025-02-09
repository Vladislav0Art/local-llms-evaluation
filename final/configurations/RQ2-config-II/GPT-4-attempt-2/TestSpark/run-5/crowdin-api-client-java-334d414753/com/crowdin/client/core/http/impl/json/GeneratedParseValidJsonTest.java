package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() throws JsonProcessingException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"Test Project\",\"identifier\":\"test\",\"id\":1,\"createdDate\":\"2020-09-15T09:30:00Z\"}";
        Project project = transformer.parse(json, Project.class);

        assertNotNull(project);
        assertEquals("Test Project", project.getName());
        assertEquals("test", project.getIdentifier());
        assertEquals(1, project.getId().intValue());
    }

}