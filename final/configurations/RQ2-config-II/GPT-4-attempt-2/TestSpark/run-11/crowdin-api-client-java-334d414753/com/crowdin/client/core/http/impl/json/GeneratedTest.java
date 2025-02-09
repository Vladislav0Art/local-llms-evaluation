package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {


    private static final String JSON_PROJECT = "{\"id\":1,\"name\":\"Test\",\"identifier\":\"test\",\"description\":\"Test project\"}";
    JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseValidJsonTest() {
        Project project = jsonTransformer.parse(JSON_PROJECT, Project.class);
        Assert.assertEquals(new Integer(1), project.getId());
        Assert.assertEquals("Test", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        jsonTransformer.parse("Invalid JSON", Project.class);
    }

    @Test
    public void convertValidObjectTest() {
        Project project = new Project();
        project.setId(1);
        project.setName("Test");
        project.setIdentifier("test");
        project.setDescription("Test project");

        String jsonProject = jsonTransformer.convert(project);
        Assert.assertEquals(JSON_PROJECT, jsonProject);
    }

    @Test
    public void convertInvalidObjectTest() {
        jsonTransformer.convert(new Object());
    }

}