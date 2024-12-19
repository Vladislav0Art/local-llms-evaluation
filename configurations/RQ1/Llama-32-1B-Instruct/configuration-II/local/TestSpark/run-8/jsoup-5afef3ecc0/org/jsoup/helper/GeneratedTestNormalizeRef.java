package org.jsoup.helper;

public class GeneratedTestNormalizeRef {

    @Test
    public void testNormalizeRef() throws UnsupportedEncodingException {
        String ref = "test/ref";
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        String normalizedRef = urlBuilder.normalizeRef(ref);
        assertEquals("test#ref", normalizedRef);
    }

}