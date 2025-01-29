package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestParseJson {

    @Test
    public void testParseJson() throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();

        String json = "{\"name\":\"John\",\"age\":30}";
        Project project = jsonMapper.readValue(json, Project.class);

        assertEquals(30, project.getAge());
    }

}