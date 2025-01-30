package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedConvertObjectToJsonTest {

    private final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertObjectToJsonTest() {
        Project project = new Project();
        project.setName("My project");
        String result = jacksonJsonTransformer.convert(project);
        Assert.assertTrue(result.contains("My project"));
    }

}