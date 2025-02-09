package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedConvertObjectToJsonTest {

    @Test
    public void convertObjectToJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1);
        project.setName("test");
        String json = transformer.convert(project);
        Assert.assertEquals("{ \"id\":1, \"name\":\"test\" }", json);
    }

}