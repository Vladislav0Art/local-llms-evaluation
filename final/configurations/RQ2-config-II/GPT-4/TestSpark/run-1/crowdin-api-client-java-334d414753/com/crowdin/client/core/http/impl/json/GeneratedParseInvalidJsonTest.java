package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.parse("{\"key\":\"value\"}", String.class);
    }

}