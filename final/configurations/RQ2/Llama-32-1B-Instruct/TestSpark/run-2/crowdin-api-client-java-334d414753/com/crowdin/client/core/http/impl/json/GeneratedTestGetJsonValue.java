package com.crowdin.client.core.http.impl.json;

import com.crowdin.api.client.core.http.impl.json.JacksonJsonTransformerImpl;
import org.junit.Test;

public class GeneratedTestGetJsonValue {

    @Test
    public void testGetJsonValue() {
        JsonValue jsonValue = new JacksonJsonTransformerImpl().transformJson("John", "Jane");
        assertEquals(jsonValue, new ObjectMapper().readValue(jsonValue.toString(), JsonValue.class));
    }

}