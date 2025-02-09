package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{ \"id\":1, \"name\":\"test\" }";
        Project project = transformer.parse(json, Project.class);
        Assert.assertEquals(1, project.getId().intValue());
        Assert.assertEquals("test", project.getName());
    }

}