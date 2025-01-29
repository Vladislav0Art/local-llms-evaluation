package com.crowdin.client.core.http.impl.json;

import com.crowdin.api.client.core.http.impl.json.JacksonJsonTransformerImpl;
import org.junit.Test;

public class GeneratedTestGetList {

    @Test
    public void testGetList() {
        List<String> list = new ArrayList<>();
        list.add("item1");
        list.add("item2");
        JsonValue jsonValue = new JacksonJsonTransformerImpl().transformJson(list);
        assertEquals(jsonValue, new ObjectMapper().readValue(jsonValue.toString(), JsonValue.class));
    }

}