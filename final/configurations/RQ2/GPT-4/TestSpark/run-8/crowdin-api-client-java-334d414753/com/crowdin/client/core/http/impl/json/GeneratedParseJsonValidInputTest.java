package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class GeneratedParseJsonValidInputTest {

    @Test
    public void parseJsonValidInputTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"identifier\":\"test_project\", \"name\":\"Test Project\"}";
        Project result = transformer.parse(json, Project.class);
        Assert.assertEquals("Test Project", result.getName());
    }

}