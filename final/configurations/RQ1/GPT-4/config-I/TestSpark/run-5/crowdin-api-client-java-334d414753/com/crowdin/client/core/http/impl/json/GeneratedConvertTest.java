package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertTest {

    @Test
    public void convertTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("Test Project");
        String result = jacksonJsonTransformer.convert(project);
        assertNotNull(result);
        assertEquals("{\"name\":\"Test Project\"}", result);
    }

}