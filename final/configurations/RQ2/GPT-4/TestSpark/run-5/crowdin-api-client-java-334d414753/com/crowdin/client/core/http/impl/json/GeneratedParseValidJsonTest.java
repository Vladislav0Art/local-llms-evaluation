package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseValidJsonTest() {
        String json = "{\"id\":1,\"name\":\"Project\"}";
        Project project = transformer.parse(json, Project.class);
        Assert.assertNotNull(project);
        Assert.assertEquals(Long.valueOf(1), project.getId());
        Assert.assertEquals("Project", project.getName());
    }

}