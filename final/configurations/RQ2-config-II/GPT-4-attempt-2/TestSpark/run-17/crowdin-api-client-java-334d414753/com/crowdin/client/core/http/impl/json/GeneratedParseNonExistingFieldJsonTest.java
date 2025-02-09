package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseNonExistingFieldJsonTest {

    @Test
    public void parseNonExistingFieldJsonTest() {
        String json = "{\"non_existing_field\":\"value\"}";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        transformer.parse(json, Project.class);
    }

}