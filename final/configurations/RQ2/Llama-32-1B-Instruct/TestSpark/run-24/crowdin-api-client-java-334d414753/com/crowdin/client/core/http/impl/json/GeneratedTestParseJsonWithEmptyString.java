package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseJsonWithEmptyString {

    @Test
    public void testParseJsonWithEmptyString() throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();
        String json = "{\"name\":\"John\",\"age\":30,\"date\":\"\"}";
        Project project = jsonMapper.readValue(json, Project.class);

        assertNotNull(project.getName());
        assertEquals(30, project.getAge());
    }

}