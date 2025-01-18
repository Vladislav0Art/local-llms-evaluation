package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;

import java.text.DateFormat;
import java.util.TimeZone;
import java.util.Locale;

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() throws CrowdinApiException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String testJson = "{\"id\"\"123\",\"name\":\"test project\"}";
        // Expect an exception due to invalid JSON
        Project project = transformer.parse(testJson, Project.class);
    }

}