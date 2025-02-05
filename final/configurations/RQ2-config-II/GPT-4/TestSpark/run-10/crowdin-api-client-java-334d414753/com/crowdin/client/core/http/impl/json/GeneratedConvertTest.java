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

public class GeneratedConvertTest {

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

}