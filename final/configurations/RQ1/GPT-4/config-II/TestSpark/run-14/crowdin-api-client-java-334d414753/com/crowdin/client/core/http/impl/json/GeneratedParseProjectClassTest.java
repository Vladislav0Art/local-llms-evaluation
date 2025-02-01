package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseProjectClassTest {

    // The instance of class under test
    JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseProjectClassTest() throws Exception {
        String json = "{\"id\":1,\"name\":\"Test Project\"}";
        Project actual = transformer.parse(json, Project.class);
        assertNotNull(actual);
        assertEquals(1, actual.getId());
        assertEquals("Test Project", actual.getName());
    }

}