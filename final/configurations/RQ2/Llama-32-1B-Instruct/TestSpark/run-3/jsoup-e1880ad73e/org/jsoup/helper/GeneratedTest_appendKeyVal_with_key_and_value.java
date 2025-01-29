package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_appendKeyVal_with_key_and_value {

    @Test
    public void test_appendKeyVal_with_key_and_value() {
        String key = "name";
        String value = "John Doe";
        String inputUrl = "https://example.com";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        KeyVal kv = new KeyVal(key, value);
        assertNotEquals("", builder.appendKeyVal(kv));
    }

}