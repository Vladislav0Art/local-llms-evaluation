package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_PunyCodingHost_MalformedReference {

    @Test
    public void testAppendKeyVal_PunyCodingHost_MalformedReference() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://user:pass@example.com/path?query=value"));
        assert null == urlBuilder.q;
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("key", "value").build());
        urlBuilder.appendKeyVal(new KeyVal.Builder().put("ref", "#reference").build());
        String normalizedUrl = urlBuilder.build();
        assertEquals("http://user:pass@example.com/path?query=value#reference", normalizedUrl);
    }

}