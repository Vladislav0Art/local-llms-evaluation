package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Map;

public class GeneratedTestAppendKeyVal_UnsupportedEncodingException {

    private final UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
    private static final String[] KEY_VALUES = {"key1", "value2"};
    private static final int NUMBER_OF_KEY_VALS = KEY_VALUES.length;
    private static final String expectedUrlPrefix = "https://example.com/";
    private static final URI expectedUrl = new URI(expectedUrlPrefix);

    @Test
    public void testAppendKeyVal_UnsupportedEncodingException() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], "wrong type string".repeat(i));
            urlBuilder.appendKeyVal(kvMap);
            assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.build());
        }
    }

}