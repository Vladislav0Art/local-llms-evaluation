package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GeneratedParseValidJsonTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{ \"name\": \"test\", \"id\": 1 }";
        Project result = transformer.parse(validJson, Project.class);
        assertNotNull(result);
        assertEquals("test", result.getName());
        assertEquals(1, result.getId());
    }

}