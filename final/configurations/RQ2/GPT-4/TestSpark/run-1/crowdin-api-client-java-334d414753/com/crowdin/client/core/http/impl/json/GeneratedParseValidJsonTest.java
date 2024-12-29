package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "{\"id\":1,\"name\":\"Test Project\"}";
        Project project = jsonTransformer.parse(jsonString, Project.class);

        Assert.assertEquals(1L, (long) project.getId());
        Assert.assertEquals("Test Project", project.getName());
    }

}