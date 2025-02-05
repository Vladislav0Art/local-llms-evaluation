package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseWrongJsonFormatTest {

    // Test the parse() method when correct json and class type is provided

    @Test
    public void parseWrongJsonFormatTest() throws Exception {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String invalidJson = "invalid json format";
        Project project = jsonTransformer.parse(invalidJson, Project.class);
    }

}