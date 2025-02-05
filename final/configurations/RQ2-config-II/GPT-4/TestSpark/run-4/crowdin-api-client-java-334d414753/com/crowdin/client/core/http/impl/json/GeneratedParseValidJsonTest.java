package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"id\":1,\"name\":\"Test project\"}";
        Project project = transformer.parse(validJson, Project.class);
        assertNotNull(project);
        assertEquals((Integer) 1, project.getId());
        assertEquals("Test project", project.getName());
    }

}