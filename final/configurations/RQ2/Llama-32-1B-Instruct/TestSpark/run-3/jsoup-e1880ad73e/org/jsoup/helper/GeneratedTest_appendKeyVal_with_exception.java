package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_appendKeyVal_with_exception {

    @Test
    public void test_appendKeyVal_with_exception() {
        String key = "name";
        String value = "John Doe";
        String inputUrl = "https://example.com";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertThrows(MalformedURLException.class, () -> builder.appendKeyVal(new KeyVal(key, value)));
    }

}