package com.crowdin.client.core.http.impl.json;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedTestConvertValidObject {

    private JacksonJsonTransformer jsonJsonTransformer;

    @Before
    public void setup() {
        jsonJsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void testConvertValidObject() throws Exception {
        Project project = new Project();
        project.setId(1);
        project.setName("John");
        project.setAge(30);
        String result = jsonJsonTransformer.convert(project);
        assertNotNull(result);
        assertTrue(result.contains("\"id\":1"));
        assertTrue(result.contains("\"name\":\"John\"");
        assertTrue(result.contains("\"age\":30"));
    }

}