package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Map;

public class GeneratedTest {

    private final UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
    private static final String[] KEY_VALUES = {"key1", "value2"};
    private static final int NUMBER_OF_KEY_VALS = KEY_VALUES.length;
    private static final String expectedUrlPrefix = "https://example.com/";
    private static final URI expectedUrl = new URI(expectedUrlPrefix);

    @Test
    public void testBuild() {
        URLBuilder builder = new UrlBuilder(new URL("https://example2.com"));
        assertEquals(expectedUrl, builder.build());
    }

    @Test
    public void testAppendKeyVal_NoException() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], String.valueOf(i));
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_UnsupportedEncodingException() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], "wrong type string".repeat(i));
            urlBuilder.appendKeyVal(kvMap);
            assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.build());
        }
    }

    @Test
    public void testAppendKeyVal_SameKeyMultipleTimes() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], "value".repeat(i));
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_DifferentKeys() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], "value".repeat(i));
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_EmptyKeyVals() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of();
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_EmptyKeyValue() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of("", "");
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_WrongKeyLength() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], "wrong length string".repeat(i));
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_SplitKeyValues() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], "value".repeat(i));
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_DifferentKeysAndValues() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], "value".repeat(i));
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_EmptyStringValues() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of();
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_SplitStringValues() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], "value".repeat(i));
            urlBuilder.appendKeyVal(kvMap);
            assertEquals(expectedUrlPrefix + expectedUrl.getScheme() + "://" + expectedUrl.getHost(), urlBuilder.build().toUri().toString());
        }
    }

    @Test
    public void testAppendKeyVal_WrongStringType() {
        for (int i = 0; i < NUMBER_OF_KEY_VALS; i++) {
            Map<String, String> kvMap = Map.of(KEY_VALUES[i], "wrong type string".repeat(i));
            urlBuilder.appendKeyVal(kvMap);
            assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.build());
        }
    }

}