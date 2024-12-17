package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedAppend_key_value_null_kv {

    @Test
    public void append_key_value_null_kv() {
        URL inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(null);
        try {
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException to be thrown");
        }
    }

}