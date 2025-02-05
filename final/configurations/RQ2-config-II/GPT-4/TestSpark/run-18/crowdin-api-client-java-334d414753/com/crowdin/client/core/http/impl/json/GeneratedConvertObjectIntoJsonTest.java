package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedConvertObjectIntoJsonTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertObjectIntoJsonTest() {
        Project project = new Project();
        project.setName("TestProject");
        project.setDescription("TestDescription");
        String json = jacksonJsonTransformer.convert(project);
        Assert.assertTrue(json.contains("\"name\":\"TestProject\""));
        Assert.assertTrue(json.contains("\"description\":\"TestDescription\""));
    }

}