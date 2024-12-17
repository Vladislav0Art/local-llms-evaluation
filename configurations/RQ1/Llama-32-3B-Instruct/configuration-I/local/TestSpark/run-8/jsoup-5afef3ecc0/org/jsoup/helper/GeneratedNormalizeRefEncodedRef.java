package org.jsoup.helper;

public class GeneratedNormalizeRefEncodedRef {

    @Test
    public void normalizeRefEncodedRef() throws UnsupportedEncodingException {
        String r = "%20test%20ref";
        String normalized = UrlBuilder.normalizeRef(r);
        assertEquals("%20test%20ref", normalized);
    }

}