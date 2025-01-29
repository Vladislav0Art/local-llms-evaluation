package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseJsonWithNull {

    @Test
    public void testParseJsonWithNull() throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();
        String json = "{\"name\":\"John\",\"age\":null}";
        Project project = jsonMapper.readValue(json, Project.class);

        assertNotNull(project.getName());
        assertEquals(30, project.getAge());
    }

}