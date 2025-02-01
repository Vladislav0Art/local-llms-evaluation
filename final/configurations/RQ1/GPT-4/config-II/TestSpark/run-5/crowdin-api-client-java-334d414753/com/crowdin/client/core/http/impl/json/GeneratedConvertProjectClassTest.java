package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertProjectClassTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertProjectClassTest() throws Exception {
        Project project = new Project();
        project.setId(1L);
        project.setName("Test Project");
        String serializedProject = jacksonJsonTransformer.convert(project);
        assertNotEquals("", serializedProject);
    }

}