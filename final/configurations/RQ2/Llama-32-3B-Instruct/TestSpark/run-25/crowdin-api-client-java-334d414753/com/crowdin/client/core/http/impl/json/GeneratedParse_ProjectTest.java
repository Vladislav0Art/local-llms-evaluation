package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedParse_ProjectTest {

    @Test
    public void parse_ProjectTest() {
        String json = "{\"name\":\"ProjectName\",\"description\":\"ProjectDescription\"}";
        Project project = JacksonJsonTransformer.parse(json, Project.class);
        assertNotNull(project);
        assertEquals("ProjectName", project.getName());
        assertEquals("ProjectDescription", project.getDescription());
    }

}