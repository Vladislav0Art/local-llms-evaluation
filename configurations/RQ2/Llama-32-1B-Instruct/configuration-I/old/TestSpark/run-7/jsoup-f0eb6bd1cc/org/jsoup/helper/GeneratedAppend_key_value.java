package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedAppend_key_value {

    @Test
    public void append_key_value() {
        URL inputUrl = "https://example.com/path";
        Map<String, String> kvMap = Map.of("key1", "value1", "key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kvMap);
        String outputUri = urlBuilder.build().toString();
        assertNotNull(outputUri);
    }

}