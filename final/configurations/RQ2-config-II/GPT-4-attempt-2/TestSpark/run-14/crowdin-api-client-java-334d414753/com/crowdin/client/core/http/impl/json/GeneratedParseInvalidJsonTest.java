package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{ \"id:\"1, \"name\":\"test\" }"; // :" has been intentionally removed to make JSON invalid
        Project project = transformer.parse(json, Project.class);
    }

}