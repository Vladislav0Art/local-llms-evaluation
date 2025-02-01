package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseProjectClassTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseProjectClassTest() throws Exception {
        Project project = jacksonJsonTransformer.parse("{\"id\":1, \"name\":\"Test Project\"}", Project.class);
        assertNotNull(project);
        assertEquals(1, project.getId().intValue());
        assertEquals("Test Project", project.getName());
    }

}