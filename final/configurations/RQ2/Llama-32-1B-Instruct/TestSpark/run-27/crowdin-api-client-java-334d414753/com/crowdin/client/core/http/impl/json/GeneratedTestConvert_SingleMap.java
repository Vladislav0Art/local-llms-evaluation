package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class GeneratedTestConvert_SingleMap {

    private ObjectMapper objectMapper;

    @Test
    public void testConvert_SingleMap() throws Exception {
        String json = "{\"key\":\"value\"}";
        Map<String, Object> map = objectMapper.readValue(json, Map.class);
        Project project = new Project();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            project.set(entry.getKey(), entry.getValue());
        }
        Assert.assertNotNull(project);
    }

}