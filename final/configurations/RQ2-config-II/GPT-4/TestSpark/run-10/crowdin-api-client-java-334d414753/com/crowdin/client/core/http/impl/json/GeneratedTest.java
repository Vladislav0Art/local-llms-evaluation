package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"projectName\": \"HelloWorld\"}";
        try {
            Project project = transformer.parse(json, Project.class);
            assertTrue("Project Name should be HelloWorld", project.getProjectName().equals("HelloWorld"));
        } catch (CrowdinApiException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"projectName\": \"HelloWorld\"";
        try {
            transformer.parse(json, Project.class);
            fail("Exception should be thrown");
        } catch (CrowdinApiException e) {
            assertTrue("Exception should be of correct type", e instanceof CrowdinApiException);
        }
    }

    @Test
    public void convertTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(123456L);
        project.setProjectName("HelloWorld");
        try {
            String jsonString = transformer.convert(project);
            assertTrue("Should be able to convert to Json String", jsonString.contains("\"projectName\": \"HelloWorld\""));
        } catch (HttpException e) {
            fail("Exception should not be thrown");
        }
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        try {
            transformer.convert(null);
            fail("Exception should be thrown");
        } catch (HttpException e) {
            assertTrue("Exception should be of correct type", e instanceof HttpBadRequestException);
        }
    }

}