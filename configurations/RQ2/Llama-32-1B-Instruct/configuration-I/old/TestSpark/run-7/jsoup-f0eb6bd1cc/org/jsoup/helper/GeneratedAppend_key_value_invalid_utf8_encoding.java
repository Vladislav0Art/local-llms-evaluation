package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedAppend_key_value_invalid_utf8_encoding {

    @Test
    public void append_key_value_invalid_utf8_encoding() throws URISyntaxException {
        URL inputUrl = "https://example.com/path";
        Map<String, String> kvMap = Map.of("key1", "value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kvMap);
        URI uri = new URI(urlBuilder.build().toString());
        assertNotEquals(null, uri);
    }

}