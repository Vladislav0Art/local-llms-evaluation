package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedParseNullClassTest {

    @Test
    public void parseNullClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.parse("{\"key\":\"value\"}", null);
    }

}