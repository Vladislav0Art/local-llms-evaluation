package org.jsoup.helper;

import org.jsoup.helper.KeyValue;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestAppendKeyVal_URLEncoder {

    private static final String URL = "https://example.com/path";
    private static final Map<String, String> expectedMap = Map.of("key", "value");
    private static final UrlBuilder underTest = new UrlBuilder(new URL());

    @BeforeClass
    public static void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAppendKeyVal_URLEncoder() throws UnsupportedEncodingException {
        Map<String, String> map = Map.of("key", "value");
        underTest.appendKeyVal(map);
        assertEquals(map.size(), 2);
    }

}