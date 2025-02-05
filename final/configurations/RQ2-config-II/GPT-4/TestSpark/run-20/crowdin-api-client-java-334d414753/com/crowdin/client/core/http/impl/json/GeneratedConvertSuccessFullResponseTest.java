package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertSuccessFullResponseTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertSuccessFullResponseTest() {
        String expectedJson = "{\"name\":\"TestProject\"}";

        Project project = new Project();
        project.setName("TestProject");

        String result = jacksonJsonTransformer.convert(project);

        Assert.assertEquals(expectedJson, result);
    }

}