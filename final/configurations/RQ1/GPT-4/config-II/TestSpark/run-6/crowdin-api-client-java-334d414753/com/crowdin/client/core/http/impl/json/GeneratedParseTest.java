package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseTest {

    @Test
    public void parseTest() throws IOException {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Test Project\"}";
        Project project = jacksonJsonTransformer.parse(json, Project.class);
        Assert.assertNotNull(project);
        Assert.assertEquals(1, project.getId().intValue());
        Assert.assertEquals("Test Project", project.getName());
    }

}