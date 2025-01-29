package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertObjectToJsonString {

    @Test
    public void TestConvertObjectToJsonString() throws Exception {
        Project project = new Project();
        project.setDisplayName("Test Project");
        project.setId(123);
        String expectedJson = "{\"name\":\"Test Project\",\"id\":123}";
        String actualJson = new JacksonJsonTransformer().convert(project);
        assertEquals(expectedJson, actualJson);
    }

}