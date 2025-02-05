package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

        String json = "{ \"name\":\"Test Project\", \"id\":\"1\" }";
        Project project = jsonTransformer.parse(json, Project.class);

        Assert.assertEquals("Test Project", project.getName());
        Assert.assertEquals("1", project.getId());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

        String json = "Invalid Json";
        Project project = jsonTransformer.parse(json, Project.class);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

        Project project = new Project();
        project.setName("Test Project");
        project.setId("1");

        String result = jsonTransformer.convert(project);
        Assert.assertEquals("{ \"name\":\"Test Project\", \"id\":\"1\" }", result);
    }

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

        Object obj = new Object();
        String result = jsonTransformer.convert(obj);
    }

}