package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.text.ParseException;

import static org.junit.Assert.*;

public class GeneratedParseJsonWithExtraDataTest {

    @Test
    public void parseJsonWithExtraDataTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        String jsonWithExtraData = "{\"id\": 1, \"name\": \"Project Test\", \"extraData\": \"Other Data\"}";

        Project project = transformer.parse(jsonWithExtraData, Project.class);

        assertNotNull(project);
        assertEquals(new Integer(1), project.getId());
        assertEquals("Project Test", project.getName());
    }

}