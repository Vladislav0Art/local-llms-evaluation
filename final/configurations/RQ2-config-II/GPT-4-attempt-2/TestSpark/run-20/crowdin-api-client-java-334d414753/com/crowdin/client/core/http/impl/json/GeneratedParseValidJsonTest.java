package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.text.ParseException;

import static org.junit.Assert.*;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        String validJson = "{\"id\": 1, \"name\": \"Project Test\"}";

        Project project = transformer.parse(validJson, Project.class);

        assertNotNull(project);
        assertEquals(new Integer(1), project.getId());
        assertEquals("Project Test", project.getName());
    }

}