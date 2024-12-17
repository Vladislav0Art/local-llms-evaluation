package org.jsoup.helper;

import org.jsoup.helper.KeyValue;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestAppendKeyVal_ConvertToMap_ConvertedMap {

    private static final String URL = "https://example.com/path";
    private static final Map<String, String> expectedMap = Map.of("key", "value");
    private static final UrlBuilder underTest = new UrlBuilder(new URL());

    @BeforeClass
    public static void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAppendKeyVal_ConvertToMap_ConvertedMap() throws UnsupportedEncodingException {
        this.expectedMap.put("key", "value");
        underTest.appendKeyVal(KeyValue.of("key", KeyValue.parseMap(expectedMap)));
        assertEquals(1, underTest.build().size());
    }

}