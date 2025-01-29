package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_SimpleScenario_KeyNotExistent {

    private String inputUrl = "https://example.com";

    @Test
    public void testAppendKeyVal_SimpleScenario_KeyNotExistent() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        URL resultingUrl = urlBuilder.build();
        assertNull(resultingUrl);
    }

}