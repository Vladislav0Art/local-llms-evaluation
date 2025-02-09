package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = transformer.parse("{\"id\":1,\"name\":\"Project\"}", Project.class);
        assertEquals(project.getId(), Integer.valueOf(1));
        assertEquals(project.getName(), "Project");
    }

}