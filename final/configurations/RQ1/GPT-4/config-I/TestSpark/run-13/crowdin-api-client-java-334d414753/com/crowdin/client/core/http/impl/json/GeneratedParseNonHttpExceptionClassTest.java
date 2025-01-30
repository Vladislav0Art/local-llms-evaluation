package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNonHttpExceptionClassTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseNonHttpExceptionClassTest() {
        String json = "{\"name\":\"test project\",\"identifier\":\"test\",\"id\":1}";
        Project project = transformer.parse(json, Project.class);

        Assert.assertNotNull(project);
        Assert.assertEquals("test project", project.getName());
        Assert.assertEquals("test", project.getIdentifier());
        Assert.assertEquals(Long.valueOf(1), project.getId());
    }

}