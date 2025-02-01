package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseProjectClassTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseProjectClassTest() throws Exception {
        String json = "{ \"id\": 1, \"name\": \"Example Project\" }";

        Project result = jacksonJsonTransformer.parse(json, Project.class);

        assertEquals(1L, (long) result.getId());
        assertEquals("Example Project", result.getName());
    }

}