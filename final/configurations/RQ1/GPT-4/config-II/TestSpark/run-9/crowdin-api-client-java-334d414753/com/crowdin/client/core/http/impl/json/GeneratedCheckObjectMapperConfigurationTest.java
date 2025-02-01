package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCheckObjectMapperConfigurationTest {

    @Test
    public void checkObjectMapperConfigurationTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validProjectJson = "{\"name\":\"Test Project\"}";
        Project project = transformer.parse(validProjectJson, Project.class);
        assertEquals("Test Project", project.getName());
    }

}