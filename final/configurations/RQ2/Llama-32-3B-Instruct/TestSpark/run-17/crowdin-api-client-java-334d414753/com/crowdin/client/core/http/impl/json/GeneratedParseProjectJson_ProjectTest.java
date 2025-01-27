package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

import java.io.IOException;
import java.util.Date;

public class GeneratedParseProjectJson_ProjectTest {

    @Test
    public void parseProjectJson_ProjectTest() throws IOException {
        String json = "{\"projectName\":\"test\",\"groupId\":\"123\"}";
        Project project = JacksonJsonTransformer.parse(json, Project.class);
        assertNotNull(project);
        assertEquals("test", project.getName());
        assertEquals("123", project.getGroupId());
    }

}