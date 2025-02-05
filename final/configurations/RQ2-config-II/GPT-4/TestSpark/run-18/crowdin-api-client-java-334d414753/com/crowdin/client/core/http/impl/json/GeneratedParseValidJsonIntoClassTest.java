package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseValidJsonIntoClassTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseValidJsonIntoClassTest() {
        String json = "{\"name\":\"TestProject\", \"description\":\"TestDescription\"}";
        Project project = jacksonJsonTransformer.parse(json, Project.class);
        Assert.assertNotNull(project);
        Assert.assertEquals("TestProject", project.getName());
        Assert.assertEquals("TestDescription", project.getDescription());
    }

}