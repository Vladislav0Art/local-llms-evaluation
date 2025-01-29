package org.jsoup.helper;

public class GeneratedAppendKeyVal_EmptyKeyValueScenario {

    @Test
    public void appendKeyVal_EmptyKeyValueScenario() {
        String inputKey = "test";
        Connection.KeyVal kv = new Connection.KeyVal(inputKey, "");
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);
        URL actualUrl = urlBuilder.build();
        assertEquals("https://example.com/path?test=", actualUrl.toString());
    }

}