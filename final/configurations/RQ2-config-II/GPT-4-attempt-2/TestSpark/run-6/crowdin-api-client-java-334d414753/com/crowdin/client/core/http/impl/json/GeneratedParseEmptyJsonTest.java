package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GeneratedParseEmptyJsonTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String emptyJson = "{}";
        Project result = transformer.parse(emptyJson, Project.class);
        assertNotNull(result);
        assertNull(result.getName());
        assertEquals(0, result.getId());
    }

}