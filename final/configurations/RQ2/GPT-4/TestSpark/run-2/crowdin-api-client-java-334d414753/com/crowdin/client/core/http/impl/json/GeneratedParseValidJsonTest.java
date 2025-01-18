package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{ \"id\": 1, \"name\": \"Instance\" }";

        Project project = transformer.parse(json, Project.class);

        Assert.assertEquals(Long.valueOf(1), project.getId());
        Assert.assertEquals("Instance", project.getName());
    }

}