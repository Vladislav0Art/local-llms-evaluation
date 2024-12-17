package org.jsoup.helper;

import org.jsoup.helper.KeyValue;
import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTest {

    private static final String URL = "https://example.com/path";
    private static final String EXPECTED_MESSAGE = "Key-value pairs are not equal";

    @BeforeClass
    public static void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAppendKeyValue() {
        UrlBuilder builder = new UrlBuilder(URL);
        Map<String, String> expectedMap = Map.of("key1", "value1");
        String result = builder.appendKeyVal(KeyValue.of("key1", "value1")).toString();
        assertEquals(EXPECTED_MESSAGE, result);
    }

    @Test
    public void testAppendKeyValueMultiplePairs() {
        UrlBuilder builder = new UrlBuilder(URL);
        Map<String, String> expectedMap = Map.of("key1", "value1", "key2", "value2");
        String result = builder.appendKeyVal(KeyValue.of("key1", "value1")).appendKeyVal(KeyValue.of("key2", "value2")).toString();
        assertEquals(EXPECTED_MESSAGE, result);
    }

    @Test
    public void testAppendKeyValueEmptyMap() {
        UrlBuilder builder = new UrlBuilder(URL);
        Map<String, String> expectedMap = Map.of();
        String result = builder.appendKeyVal(KeyValue.of("key1", "value1")).toString();
        assertEquals(EXPECTED_MESSAGE, result);
    }

    @Test
    public void testAppendKeyValueNoPairs() {
        UrlBuilder builder = new UrlBuilder(URL);
        Map<String, String> expectedMap = Map.of();
        String result = builder.appendKeyVal(KeyValue.of()).toString();
        assertEquals(EXPECTED_MESSAGE, result);
    }

}