package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseSuccessFullResponseTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseSuccessFullResponseTest() {
        String expectedProjectName = "TestProject";
        String json = "{\"name\":\"" + expectedProjectName + "\"}";

        Project result = jacksonJsonTransformer.parse(json, Project.class);

        Assert.assertEquals(expectedProjectName, result.getName());
    }

}