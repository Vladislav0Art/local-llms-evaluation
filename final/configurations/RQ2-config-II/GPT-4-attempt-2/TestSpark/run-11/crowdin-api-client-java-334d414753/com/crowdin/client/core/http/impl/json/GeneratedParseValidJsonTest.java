package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonTest {


    private static final String JSON_PROJECT = "{\"id\":1,\"name\":\"Test\",\"identifier\":\"test\",\"description\":\"Test project\"}";
    JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseValidJsonTest() {
        Project project = jsonTransformer.parse(JSON_PROJECT, Project.class);
        Assert.assertEquals(new Integer(1), project.getId());
        Assert.assertEquals("Test", project.getName());
    }

}