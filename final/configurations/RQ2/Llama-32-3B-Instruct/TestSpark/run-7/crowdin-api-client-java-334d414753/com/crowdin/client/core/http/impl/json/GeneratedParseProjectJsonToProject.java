package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseProjectJsonToProject {

    @Test
    public void parseProjectJsonToProject() {
        String json = "{\"name\":\"ProjectName\",\"description\":\"ProjectDescription\"}";
        Project project = new Project();
        project.setName("ProjectName");
        project.setDescription("ProjectDescription");

        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Project.class, (JsonSerializer<?> serializer, JsonParser parser) -> {
            // implementation
            return project;
        });

        when(mapper.getDeserializationFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)).thenReturn(false);
        when(mapper.findAndRegisterModules()).thenReturn(module);

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project result = transformer.parse(json, Project.class);
        assertEquals(project.getName(), result.getName());
        assertEquals(project.getDescription(), result.getDescription());
    }

}