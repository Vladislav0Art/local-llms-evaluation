package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import com.crowdin.client.core.http.impl.json.JsonSerializer;

public class GeneratedTestToString {

    @Before
    public void setup() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testToString() {
        String json = "{\"key\":\"value\"}";
        Project project = new Project();
        project.setValue(json);
        assertEquals("\"value\"", project.toString().replaceAll("\"[^\"]*\"", ""));
    }

}