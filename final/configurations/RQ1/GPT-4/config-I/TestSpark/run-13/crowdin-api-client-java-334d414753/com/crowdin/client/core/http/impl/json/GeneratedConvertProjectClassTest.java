package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertProjectClassTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertProjectClassTest() {
        Project project = new Project();
        project.setName("test project");
        project.setIdentifier("test");
        project.setId(1L);

        String json = transformer.convert(project);
        String expectedJson = "{'name':'test project','identifier':'test','id':1}".replace("'", "\"");

        Assert.assertNotNull(json);
        Assert.assertEquals(expectedJson, json);
    }

}