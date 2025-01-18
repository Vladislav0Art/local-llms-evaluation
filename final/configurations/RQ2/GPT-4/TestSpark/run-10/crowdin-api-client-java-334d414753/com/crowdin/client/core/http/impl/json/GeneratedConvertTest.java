package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;

import java.text.DateFormat;
import java.util.TimeZone;
import java.util.Locale;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(Long.valueOf(456));
        project.setName("Another Test Project");

        String expectedJson = "{\"id\":456,\"name\":\"Another Test Project\"}";

        try {
            String result = transformer.convert(project);
            Assert.assertEquals(expectedJson, result);
        } catch (Exception e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

}