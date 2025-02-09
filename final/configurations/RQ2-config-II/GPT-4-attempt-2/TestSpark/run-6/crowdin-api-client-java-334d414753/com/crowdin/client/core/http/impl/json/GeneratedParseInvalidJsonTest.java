package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GeneratedParseInvalidJsonTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidJson = "{ \"name\": \"test\", \"id\": \"invalid\" }";
        exception.expect(RuntimeException.class);
        transformer.parse(invalidJson, Project.class);
    }

}