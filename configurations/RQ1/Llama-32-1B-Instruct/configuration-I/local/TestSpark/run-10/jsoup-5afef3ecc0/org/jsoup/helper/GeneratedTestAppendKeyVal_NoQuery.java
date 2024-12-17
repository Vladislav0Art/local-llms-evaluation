package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NoQuery {

    @Test
    public void testAppendKeyVal_NoQuery() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://example.com", normalizedUrl);
    }

}