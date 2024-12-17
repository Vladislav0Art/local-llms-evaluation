package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedReference {

    @Test
    public void testAppendKeyVal_MalformedReference() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("ref", "reference").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://example.com", normalizedUrl);
    }

}