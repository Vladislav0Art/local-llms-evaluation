package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class GeneratedTestParse_Simple {

    private ObjectMapper objectMapper;

    @Test
    public void testParse_Simple() throws Exception {
        String json = "{\"name\":\"Crowdin\",\"version\":1}";
        Project project = objectMapper.readValue(json, Project.class);
        Assert.assertNotNull(project);
        Assert.assertEquals("Crowdin", project.getName());
        Assert.assertEquals(1, project.getVersion());
    }

}