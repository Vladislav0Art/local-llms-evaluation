package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseInvalidJsonTest {

    private static JacksonJsonTransformer jsonTransformer;

    @BeforeClass
    public static void setUp() {
        jsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void parseInvalidJsonTest() throws IOException {
        jsonTransformer.parse("{\"test\":}", Project.class);
    }

}