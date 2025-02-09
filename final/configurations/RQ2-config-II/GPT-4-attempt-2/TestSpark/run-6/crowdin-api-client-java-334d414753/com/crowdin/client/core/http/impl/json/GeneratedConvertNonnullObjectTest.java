package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GeneratedConvertNonnullObjectTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void convertNonnullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("test");
        project.setId(1);
        String result = transformer.convert(project);
        assertNotNull(result);
        assertTrue(result.contains("\"name\":\"test\""));
        assertTrue(result.contains("\"id\":1"));
    }

}