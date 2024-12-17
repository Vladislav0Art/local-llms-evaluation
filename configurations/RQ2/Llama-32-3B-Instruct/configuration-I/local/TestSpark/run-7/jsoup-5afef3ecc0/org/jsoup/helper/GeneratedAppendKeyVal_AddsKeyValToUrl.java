package org.jsoup.helper;

public class GeneratedAppendKeyVal_AddsKeyValToUrl {

    @Test
    public void appendKeyVal_AddsKeyValToUrl() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder();
        String keyValStr = "key1=value1";
        Connection.KeyVal kv = createMockKeyVal();
        assertNotNull(urlBuilder);
        urlBuilder.appendKeyVal(kv);
        assertEquals(keyValStr, urlBuilder.toString());
    }

    private static URL createMockUrl() {
        return new URL("mock-url");
    }

}