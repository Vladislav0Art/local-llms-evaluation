package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedAppend_key_value_unsupported_encoding {

    @Test
    public void append_key_value_unsupported_encoding() {
        URL inputUrl = "https://example.com/path";
        Map<String, String> kvMap = Map.of("key1", "value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kvMap);
        try {
            urlBuilder.appendKeyVal(new UnsupportedEncodingException());
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException to be thrown");
        }
    }

}