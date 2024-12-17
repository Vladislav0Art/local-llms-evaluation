package org.jsoup.helper;

public class GeneratedNormalizeRefNormalRef {

    @Test
    public void normalizeRefNormalRef() {
        String r = "test ref";
        String normalized = UrlBuilder.normalizeRef(r);
        assertEquals(" test ref ", normalized);
    }

}