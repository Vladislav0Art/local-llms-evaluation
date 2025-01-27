package com.crowdin.client.core.http.impl.json;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedTestParseValidJson {

    private JacksonJsonTransformer jsonJsonTransformer;

    @Before
    public void setup() {
        jsonJsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void testParseValidJson() throws Exception {
        String json = "{\"id\":1,\"name\":\"John\",\"age\":30}";
        Class<?> clazz = Project.class;
        Object obj = jsonJsonTransformer.parse(json, clazz);
        assertNotNull(obj);
        assertTrue(obj instanceof Project);
    }

}