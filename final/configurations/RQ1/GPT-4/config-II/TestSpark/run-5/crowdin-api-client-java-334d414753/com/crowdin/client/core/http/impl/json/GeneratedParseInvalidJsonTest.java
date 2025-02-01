package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseInvalidJsonTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseInvalidJsonTest() {
        try {
            jacksonJsonTransformer.parse("{\"id\":1, 'name':\"Test Project\"}", Project.class);
        } catch (CrowdinApiException e) {
            assertEquals("Cannot parse json", e.getMessage());
        }
    }

}