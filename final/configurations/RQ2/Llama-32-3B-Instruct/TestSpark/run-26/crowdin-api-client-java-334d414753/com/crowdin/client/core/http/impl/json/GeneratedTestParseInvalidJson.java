package com.crowdin.client.core.http.impl.json;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedTestParseInvalidJson {

    private JacksonJsonTransformer jsonJsonTransformer;

    @Before
    public void setup() {
        jsonJsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void testParseInvalidJson() {
        String json = "{\"id\":1,\"name\":\"John\",\"age\":30}";
        Class<?> clazz = Project.class;
        assertThrows(CrowdinApiException.class, () -> jsonJsonTransformer.parse(json, clazz));
    }

}