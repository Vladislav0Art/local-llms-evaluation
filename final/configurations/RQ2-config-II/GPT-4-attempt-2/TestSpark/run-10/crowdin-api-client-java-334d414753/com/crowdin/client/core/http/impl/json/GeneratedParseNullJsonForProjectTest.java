package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNullJsonForProjectTest {

    private final JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseNullJsonForProjectTest() {
        String json = null;

        Project project = jsonTransformer.parse(json, Project.class);

        Assert.assertNull(project);
    }

}