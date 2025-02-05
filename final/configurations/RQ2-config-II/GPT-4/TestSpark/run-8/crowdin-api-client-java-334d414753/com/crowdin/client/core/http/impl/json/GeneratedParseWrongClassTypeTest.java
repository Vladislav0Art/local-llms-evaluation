package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseWrongClassTypeTest {

    // Test the parse() method when correct json and class type is provided

    @Test
    public void parseWrongClassTypeTest() throws Exception {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String validJson = "{\"name\":\"test\",\"identifier\":\"test-id\",\"description\":\"test project\"}";
        // Try to parse to object of a different type
        String nothing = jsonTransformer.parse(validJson, String.class);
    }

}