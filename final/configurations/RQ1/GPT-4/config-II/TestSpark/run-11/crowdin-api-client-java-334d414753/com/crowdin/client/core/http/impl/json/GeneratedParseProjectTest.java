package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class GeneratedParseProjectTest {

    @Test
    public void parseProjectTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String projectJson = "{\"id\":1, \"name\": \"test project\"}";
        Project project = transformer.parse(projectJson, Project.class);
        Assert.assertEquals(1, project.getId().longValue());
        Assert.assertEquals("test project", project.getName());
    }

}