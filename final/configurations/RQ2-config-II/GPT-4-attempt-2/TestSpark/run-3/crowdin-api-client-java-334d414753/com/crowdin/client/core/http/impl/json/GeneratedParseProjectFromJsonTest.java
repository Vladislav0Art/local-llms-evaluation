package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeneratedParseProjectFromJsonTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseProjectFromJsonTest() throws Exception {
        String filename = "src/test/resources/json/project.json";
        String json = new String(Files.readAllBytes(Paths.get(filename)));
        Project actual = jacksonJsonTransformer.parse(json, Project.class);
        Assert.assertNotNull(actual);
        Assert.assertEquals("Sample project", actual.getName());
    }

}