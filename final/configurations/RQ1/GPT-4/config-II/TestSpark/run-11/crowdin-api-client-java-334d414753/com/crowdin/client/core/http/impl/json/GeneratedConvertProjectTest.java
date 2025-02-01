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

public class GeneratedConvertProjectTest {

    @Test
    public void convertProjectTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1L);
        project.setName("test project");
        String projectJson = transformer.convert(project);
        Assert.assertTrue(projectJson.contains("\"id\":1"));
        Assert.assertTrue(projectJson.contains("\"name\":\"test project\""));
    }

}