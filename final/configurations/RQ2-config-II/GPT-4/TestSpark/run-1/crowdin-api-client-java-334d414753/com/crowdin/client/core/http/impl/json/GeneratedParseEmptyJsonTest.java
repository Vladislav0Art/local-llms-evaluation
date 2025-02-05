package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedParseEmptyJsonTest {

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HashMap result = transformer.parse("{}", HashMap.class);
        Assert.assertTrue(result.isEmpty());
    }

}