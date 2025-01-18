package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseJsonValidInputTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"identifier\":\"test_project\", \"name\":\"Test Project\"}";
        Project result = transformer.parse(json, Project.class);
        Assert.assertEquals("Test Project", result.getName());
    }

    @Test
    public void parseJsonInvalidInputTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "Invalid JSON";
        transformer.parse(json, Project.class);
    }

    @Test
    public void convertValidInputTest() throws JsonProcessingException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("test_file");
        String json = transformer.convert(fileInfo);
        Assert.assertTrue(json.contains("\"name\":\"test_file\""));
    }

    @Test
    public void convertNullInputTest() throws JsonProcessingException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

}