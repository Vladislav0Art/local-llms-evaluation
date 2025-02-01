package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertProjectToJSONTest {

    @Test
    public void convertProjectToJSONTest() throws JsonProcessingException {
        Project project = new Project();
        project.setId(1L);
        project.setName("test");

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String jsonResult = transformer.convert(project);

        ObjectMapper mapper = new ObjectMapper();
        Project resultProject = mapper.readValue(jsonResult, Project.class);

        Assert.assertEquals("test", resultProject.getName());
        Assert.assertEquals(Long.valueOf(1), resultProject.getId());
    }

}