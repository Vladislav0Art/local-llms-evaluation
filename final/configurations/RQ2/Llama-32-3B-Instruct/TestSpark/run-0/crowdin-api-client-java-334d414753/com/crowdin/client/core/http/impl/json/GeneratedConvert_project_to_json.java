package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

public class GeneratedConvert_project_to_json {

    @Test
    public void convert_project_to_json() {
        Project project = new Project(1, 1);
        String expected = "{\"project_id\": 1, \"group_id\": 1}";
        assertEquals(expected, JacksonJsonTransformer.convert(project).toString());
    }

}