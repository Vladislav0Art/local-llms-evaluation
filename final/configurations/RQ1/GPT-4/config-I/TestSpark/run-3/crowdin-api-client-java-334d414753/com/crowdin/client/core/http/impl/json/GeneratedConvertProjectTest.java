package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertProjectTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertProjectTest() throws JsonProcessingException {
        Project project = new Project();
        project.setId(1L);
        project.setName("Project name");
        String json = transformer.convert(project);

        Assert.assertEquals("{\"id\":1,\"name\":\"Project name\"}", json);
    }

}