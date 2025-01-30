package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertProjectToJSONTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertProjectToJSONTest() throws JsonProcessingException {
        Project project = new Project();
        project.setName("Test project");
        String json = transformer.convert(project);
        assertNotNull(json);
        assertEquals("{\"name\":\"Test project\"}", json);
    }

}