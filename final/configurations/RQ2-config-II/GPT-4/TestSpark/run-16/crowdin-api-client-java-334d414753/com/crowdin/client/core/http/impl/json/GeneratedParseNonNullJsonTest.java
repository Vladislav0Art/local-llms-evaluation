package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNonNullJsonTest {

    @Test
    public void parseNonNullJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String jsonString = "{\"id\": 1,\"name\": \"project\"}";
        Project result = transformer.parse(jsonString, Project.class);

        assertNotNull(result);
        assertEquals(1L, result.getId().longValue());
        assertEquals("project", result.getName());
    }

}