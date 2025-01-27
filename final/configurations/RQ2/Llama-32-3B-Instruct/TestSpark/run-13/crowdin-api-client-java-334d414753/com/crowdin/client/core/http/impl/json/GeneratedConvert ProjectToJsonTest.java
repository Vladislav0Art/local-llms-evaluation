package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedConvert ProjectToJsonTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void convert

    ProjectToJsonTest() {
        Project project = new Project();
        project.setName("My Project");
        project.setGroupId(123L);
        project.setPath("/my/project");

        String json = objectMapper.writeValueAsString(project);
        assertEquals("{\"name\":\"My Project\",\"groupId\":123,\"path\":\"/my/project\"}", json);
    }

}