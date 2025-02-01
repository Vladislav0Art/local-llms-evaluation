package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConvertProjectTest {

    @Test
    public void convertProjectTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1L);
        project.setName("TestProject");
        String json = transformer.convert(project);
        assertTrue(json.contains("1"));
        assertTrue(json.contains("TestProject"));
    }

}