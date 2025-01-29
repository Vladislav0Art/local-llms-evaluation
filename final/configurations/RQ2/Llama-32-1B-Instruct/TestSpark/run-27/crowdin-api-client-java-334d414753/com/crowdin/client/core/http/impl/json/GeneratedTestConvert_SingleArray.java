package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class GeneratedTestConvert_SingleArray {

    private ObjectMapper objectMapper;

    @Test
    public void testConvert_SingleArray() throws Exception {
        String json = "{\"value\":\"Hello\"}";
        Object[] array = objectMapper.readValue(json, Object[].class);
        Project project = new Project();
        for (Object value : array) {
            project.set(value.toString());
        }
        Assert.assertNotNull(project);
        Assert.assertEquals("Hello", project.getName());
        Assert.assertEquals(1, project.getVersion());
    }

}