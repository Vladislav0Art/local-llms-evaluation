package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void parseHttpExceptionTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HttpException exception = transformer.parse("{\"message\":\"test\"}", HttpException.class);
        assertEquals("test", exception.getMessage());
    }

    @Test
    public void parseHttpBadRequestExceptionTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HttpBadRequestException exception = transformer.parse("{\"message\":\"test\"}", HttpBadRequestException.class);
        assertEquals("test", exception.getMessage());
    }

    @Test
    public void parseSomeOtherClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = transformer.parse("{\"name\":\"testProject\"}", Project.class);
        assertEquals("testProject", project.getName());
    }

    @Test
    public void convertTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("test");
        String jsonString = transformer.convert(project);
        assertTrue(jsonString.contains("\"name\":\"test\""));
    }

    @Test
    public void parseInvalidJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.parse("{unclosedJson", Project.class);
    }

    @Test
    public void convertNullTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

}