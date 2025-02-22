package org.jsoup.helper;

public class GeneratedTestNormalizeRef {

    @Test
    public void testNormalizeRef() {
        String ref = "key1=value1&key2=value2";
        String normalizedRef = UrlBuilder.normalizeRef(ref);
        assertEquals("key1=value1&key2=value2", normalizedRef);
    }

}