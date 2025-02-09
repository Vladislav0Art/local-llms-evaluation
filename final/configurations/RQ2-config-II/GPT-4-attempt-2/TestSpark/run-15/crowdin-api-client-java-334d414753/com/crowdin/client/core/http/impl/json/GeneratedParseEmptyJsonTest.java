package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseEmptyJsonTest {

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        Project project = transformer.parse("", Project.class);

        assertNull(project);
    }

}