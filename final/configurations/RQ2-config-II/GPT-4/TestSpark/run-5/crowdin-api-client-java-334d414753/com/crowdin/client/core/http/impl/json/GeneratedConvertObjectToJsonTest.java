package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertObjectToJsonTest {

    @Test
    public void convertObjectToJsonTest() {
        Project project = new Project();
        project.setName("TestProject");

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = transformer.convert(project);

        Assert.assertNotNull(json);
        Assert.assertTrue(json.contains("\"name\":\"TestProject\""));
    }

}