package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseInvalidJsonScenarioTest {

    @Test
    public void parseInvalidJsonScenarioTest() {
        String json = "{unparsable json}";
        Class<Project> clazz = Project.class;
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();

        jsonTransformer.parse(json, clazz);
    }

}