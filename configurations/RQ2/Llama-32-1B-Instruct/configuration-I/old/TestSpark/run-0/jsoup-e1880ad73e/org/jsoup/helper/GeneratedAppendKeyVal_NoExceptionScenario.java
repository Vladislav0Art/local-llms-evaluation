package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;

public class GeneratedAppendKeyVal_NoExceptionScenario {

    @Test
    public void appendKeyVal_NoExceptionScenario() {
        UrlBuilder builder = new UrlBuilder("http://example.com");
        String key = "test";
        String value = "hello";
        int result = builder.appendKeyVal(Connection.KeyVal.create(key, value));
        assertEquals(2, result);
    }

}