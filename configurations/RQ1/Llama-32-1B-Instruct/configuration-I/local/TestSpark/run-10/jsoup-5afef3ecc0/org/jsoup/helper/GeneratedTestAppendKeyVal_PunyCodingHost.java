package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_PunyCodingHost {

    @Test
    public void testAppendKeyVal_PunyCodingHost() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://user:pass@example.com/path?query=value&ref=reference"));
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://user:pass@example.com/path#reference", normalizedUrl);
    }

}