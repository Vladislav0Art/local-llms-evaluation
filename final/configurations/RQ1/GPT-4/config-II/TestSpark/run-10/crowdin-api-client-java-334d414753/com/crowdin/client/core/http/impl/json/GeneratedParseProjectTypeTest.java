package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseProjectTypeTest {

    @Test
    public void parseProjectTypeTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String jsonProject = "{\"id\" : 1, \"name\":\"test\"}";

        Project resultProject = transformer.parse(jsonProject, Project.class);
        Assert.assertEquals("test", resultProject.getName());
        Assert.assertEquals(Long.valueOf(1), resultProject.getId());
    }

}