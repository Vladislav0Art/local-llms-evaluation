package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseInValidJsonStringToProjectTest {

    private JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseInValidJsonStringToProjectTest() {
        String jsonString = "{\"id\":\"one\",\"name\":\"Test project\",\"description\":\"TDD project\"}";

        jsonTransformer.parse(jsonString, Project.class);
    }

}