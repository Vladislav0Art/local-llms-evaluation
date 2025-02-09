package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.text.ParseException;

import static org.junit.Assert.*;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1);
        project.setName("Project Test");

        String result = transformer.convert(project);

        assertEquals("{\"id\":1,\"name\":\"Project Test\"}", result);
    }

    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Object is null");

        transformer.convert(null);
    }

}