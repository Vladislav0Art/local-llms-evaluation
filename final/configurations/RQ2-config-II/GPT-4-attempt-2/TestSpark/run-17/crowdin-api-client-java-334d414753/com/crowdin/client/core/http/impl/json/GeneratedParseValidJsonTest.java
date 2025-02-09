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
public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        String json = "{\"name\":\"test project\"}";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        Project project = transformer.parse(json, Project.class);

        assertNotNull(project);
        assertEquals("test project", project.getName());
    }

}