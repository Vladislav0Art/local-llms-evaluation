package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseProjectClazzTest {

    @Test
    public void parseProjectClazzTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"Test Project\",\"identifier\":\"test_project\"}";
        Project result = jacksonJsonTransformer.parse(json, Project.class);
        assertNotNull(result);
        assertEquals("Test Project", result.getName());
    }

}