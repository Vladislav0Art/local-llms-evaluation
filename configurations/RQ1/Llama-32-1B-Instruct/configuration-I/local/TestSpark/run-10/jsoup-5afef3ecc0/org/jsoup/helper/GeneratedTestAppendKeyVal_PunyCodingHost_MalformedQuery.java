package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_PunyCodingHost_MalformedQuery {

    @Test
    public void testAppendKeyVal_PunyCodingHost_MalformedQuery() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://user:pass@example.com/path?query=value"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://user:pass@example.com/path?query=value&ref=reference", normalizedUrl);
    }

}