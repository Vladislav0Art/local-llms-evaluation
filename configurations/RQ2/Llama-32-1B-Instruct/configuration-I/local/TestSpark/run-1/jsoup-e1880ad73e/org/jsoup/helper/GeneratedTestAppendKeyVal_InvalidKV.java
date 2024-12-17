package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.HashMap;

public class GeneratedTestAppendKeyVal_InvalidKV {

    @Test
    public void testAppendKeyVal_InvalidKV() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assert urlBuilder.build().orElseThrow().ExceptionClass == java.net.UnsupportedEncodingException.class;
    }

}