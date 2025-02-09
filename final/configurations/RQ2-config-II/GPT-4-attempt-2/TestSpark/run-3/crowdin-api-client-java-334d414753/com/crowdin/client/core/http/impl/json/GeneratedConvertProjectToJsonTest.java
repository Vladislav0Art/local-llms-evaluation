package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeneratedConvertProjectToJsonTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertProjectToJsonTest() throws Exception {
        Project project = new Project();
        project.setName("Sample project");
        String actual = jacksonJsonTransformer.convert(project);
        Assert.assertNotNull(actual);
        Assert.assertTrue(actual.contains("Sample project"));
    }

}