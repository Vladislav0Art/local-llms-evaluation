package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testParse_SimpleString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Project project = (Project) parse(json, Project.class);
        assertEquals(1, project.getName().length());
        assertEquals(30, project.getAge());
    }

    @Test
    public void testParse_JsonArray() {
        String json = "[{\"id\":1,\"name\":\"John\"},{\"id\":2,\"name\":\"Jane\"}]";
        Object[] objects = parse(json, Object.class);
        Project[] projects = (Project[]) objects;
        assertEquals(2, projects.length);
        for (int i = 0; i < projects.length; i++) {
            Project project = (Project) projects[i];
            assertEquals("John", project.getName());
            assertEquals(30, project.getAge());
        }
    }

    @Test
    public void testParse_InvalidJsonArray() {
        String json = "[{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}]";
        Object[] objects = parse(json, Object.class);
        Project[] projects = (Project[]) objects;
        // Check if the conversion fails
    }

    @Test
    public void testParse_InvalidJson() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\" invalid\"}";
        try {
            objectMapper.writeValue(java.util.Arrays.asList(1, 2, 3), json);
            fail("Expected CrowdinApiException");
        } catch (CrowdinApiException e) {
            // expected exception
        }
    }

    @Test
    public void testParse_InvalidJsonString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\" invalid\"}";
        try {
            objectMapper.writeValue(java.util.Arrays.asList(1, 2, 3), json);
            fail("Expected CrowdinApiException");
        } catch (CrowdinApiException e) {
            // expected exception
        }
    }

    @Test
    public void testConvert_JsonString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        LanguageTranslations translations = convert(json, null);
        assertEquals("John", translations.getName());
        assertEquals(30, translations.getAge());
        assertEquals("New York", translations.getCity());
    }

    @Test
    public void testConvert_InvalidJsonString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\" invalid\"}";
        try {
            convert(json, null);
            fail("Expected CrowdinApiException");
        } catch (CrowdinApiException e) {
            // expected exception
        }
    }

    @Test
    public void testConvert_InvalidJsonString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\" invalid\"}";
        try {
            convert(json, "JSONParser");
            fail("Expected CrowdinApiException");
        } catch (CrowdinApiException e) {
            // expected exception
        }
    }

}