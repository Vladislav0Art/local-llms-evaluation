package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class GeneratedAppendKeyValueWithInvalidEncodingTest {

    @Test
    public void appendKeyValueWithInvalidEncodingTest() throws UnsupportedEncodingException {
        String urlStr = "https://www.example.com";
        org.jsoup.internal.StringUtil.KeyVal kv = new org.jsoup.internal.StringUtil.KeyVal("key", "\nvalue");
        UrlBuilder builder = new UrlBuilder(new URL(urlStr));
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}

public class UrlBuilder {

    public UrlBuilder(URL inputUrl) {
    }

    public URL build() {
    }

    public void appendKeyVal(org.jsoup.internal.StringUtil.KeyVal kv) throws UnsupportedEncodingException {
    }

}