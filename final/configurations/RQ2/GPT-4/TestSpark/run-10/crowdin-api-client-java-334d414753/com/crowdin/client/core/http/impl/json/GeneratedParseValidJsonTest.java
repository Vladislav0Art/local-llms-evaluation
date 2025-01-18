package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;

import java.text.DateFormat;
import java.util.TimeZone;
import java.util.Locale;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String testJson = "{\"id\":123,\"name\":\"test project\"}";
        try {
            Project project = transformer.parse(testJson, Project.class);
            Assert.assertEquals(Long.valueOf(123), project.getId());
            Assert.assertEquals("test project", project.getName());
        } catch (Exception e) {
            Assert.fail("Exception should not have been thrown");
        }
    }

}