package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;

public class GeneratedAppendKeyVal_IOExceptionScenario {

    @Test
    public void appendKeyVal_IOExceptionScenario() {
        UrlBuilder builder = new UrlBuilder("http://example.com");
        try {
            builder.appendKeyVal(null);
            fail("Expected IOException was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}