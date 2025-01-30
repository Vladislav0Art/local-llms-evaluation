package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseJsonToProjectTest {

    private final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseJsonToProjectTest() throws IOException {
        String json = "{\"name\":\"My project\"}";
        Project result = jacksonJsonTransformer.parse(json, Project.class);
        Assert.assertEquals("My project", result.getName());
    }

}