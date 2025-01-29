package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import com.crowdin.client.core.http.impl.json.JsonSerializer;

public class GeneratedTestEquality {

    @Before
    public void setup() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testEquality() {
        assertEquals("Value", new JacksonJsonTransformerImpl().convert("\"key\":\"value\"").getKey());
    }

}