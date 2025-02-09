package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertObjectToJsonTest {

    @Test
    public void convertObjectToJsonTest() throws JsonProcessingException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("Test Project");
        project.setIdentifier("test");
        project.setId(1L);

        String json = transformer.convert(project);
        assertEquals("{\"name\":\"Test Project\",\"identifier\":\"test\",\"id\":1}", json);
    }

}