package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_SimpleScenario_EmptyKey {

    private String inputUrl = "https://example.com";

    @Test
    public void testAppendKeyVal_SimpleScenario_EmptyKey() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("", "");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        URL resultingUrl = urlBuilder.build();
        assertEquals(null, resultingUrl);
    }

}