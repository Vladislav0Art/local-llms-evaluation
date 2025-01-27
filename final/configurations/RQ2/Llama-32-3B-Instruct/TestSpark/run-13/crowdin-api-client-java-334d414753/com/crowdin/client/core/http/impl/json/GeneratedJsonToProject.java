package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedJsonToProject {

    @Test
    public void jsonToProject() {
        JacksonJson jacksonJson = new JacksonJson();
        assertEquals("{\"name\":\"My Project\"}", jacksonJson.toProject("My Project"));
    }

}