package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NoQueryAndReference {

    @Test
    public void testAppendKeyVal_NoQueryAndReference() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://user:pass@example.com/path"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://user:pass@example.com/path", normalizedUrl);
    }

}