package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class GeneratedParseJsonInvalidInputTest {

    @Test
    public void parseJsonInvalidInputTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "Invalid JSON";
        transformer.parse(json, Project.class);
    }

}