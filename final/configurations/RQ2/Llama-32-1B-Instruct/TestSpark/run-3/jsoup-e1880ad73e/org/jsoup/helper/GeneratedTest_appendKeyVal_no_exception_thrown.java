package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_appendKeyVal_no_exception_thrown {

    @Test
    public void test_appendKeyVal_no_exception_thrown() {
        String key = "name";
        String value = "John Doe";
        String inputUrl = "https://example.com";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new KeyVal(key, value));
        assertEquals("name", URLDecoder.decode(builder.inputUrl()));
    }

}