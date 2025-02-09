package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.text.ParseException;

import static org.junit.Assert.*;

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        expectedEx.expect(CrowdinApiException.class);
        expectedEx.expectMessage("Error while parsing JSON");

        String invalidJson = "{\"id\": \"abc\", \"name\": 123}";
        transformer.parse(invalidJson, Project.class);
    }

}