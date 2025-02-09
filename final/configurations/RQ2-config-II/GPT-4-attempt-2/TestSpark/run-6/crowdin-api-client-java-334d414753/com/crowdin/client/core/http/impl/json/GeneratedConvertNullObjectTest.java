package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GeneratedConvertNullObjectTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = null;
        String result = transformer.convert(project);
        assertNotNull(result);
        assertEquals("null", result);
    }

}