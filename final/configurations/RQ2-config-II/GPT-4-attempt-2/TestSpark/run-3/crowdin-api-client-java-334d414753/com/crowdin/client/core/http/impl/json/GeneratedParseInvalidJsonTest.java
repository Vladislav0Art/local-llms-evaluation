package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeneratedParseInvalidJsonTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseInvalidJsonTest() throws Exception {
        String json = "{ bad json }";
        jacksonJsonTransformer.parse(json, Project.class);
    }

}