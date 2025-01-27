package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedConvert_ProjectTest {

    @Test
    public void convert_ProjectTest() {
        Project project = new Project();
        project.setName("ProjectName");
        project.setDescription("ProjectDescription");
        String json = JacksonJsonTransformer.convert(project);
        assertNotNull(json);
        assertTrue(json.contains("\"name\":\"ProjectName\""));
        assertTrue(json.contains("\"description\":\"ProjectDescription\""));
    }

}