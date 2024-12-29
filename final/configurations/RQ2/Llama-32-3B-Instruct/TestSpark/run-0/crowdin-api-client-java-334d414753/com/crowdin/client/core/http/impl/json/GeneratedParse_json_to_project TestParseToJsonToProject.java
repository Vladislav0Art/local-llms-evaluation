package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

public class GeneratedParse_json_to_project TestParseToJsonToProject {

    @Test
    public void parse_json_to_project

    TestParseToJsonToProject() {
        String json = "{\"project_id\": 1, \"group_id\": 1}";
        Project expected = new Project(1, 1);
        assertEquals(expected, JacksonJsonTransformer.parse(json, Project.class));
    }

}