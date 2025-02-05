package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{ \"name\": \"Test Project\", \"id\": 1, \"createdAt\": \"2022-02-15T09:40:26Z\" }";
        Project project = transformer.parse(json, Project.class);

        Assert.assertEquals("Test Project", project.getName());
        Assert.assertEquals(1, project.getId().intValue());
        Assert.assertNotNull(project.getCreatedAt());
    }

}