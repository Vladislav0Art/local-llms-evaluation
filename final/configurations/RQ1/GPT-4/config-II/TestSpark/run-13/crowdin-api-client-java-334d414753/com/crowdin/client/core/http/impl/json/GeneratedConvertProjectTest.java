package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedConvertProjectTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertProjectTest() throws JsonProcessingException {
        Project project = new Project();
        project.setName("Test Project");
        String result = jacksonJsonTransformer.convert(project);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("\"name\":\"Test Project\""));
    }

}