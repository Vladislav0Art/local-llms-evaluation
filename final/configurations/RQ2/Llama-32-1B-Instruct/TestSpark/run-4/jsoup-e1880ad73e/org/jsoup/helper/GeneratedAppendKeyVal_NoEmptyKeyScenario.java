package org.jsoup.helper;

public class GeneratedAppendKeyVal_NoEmptyKeyScenario {

    @Test
    public void appendKeyVal_NoEmptyKeyScenario() {
        String inputKey = "test";
        String inputValue = "123";
        Connection.KeyVal kv = new Connection.KeyVal(inputKey, inputValue);
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);
        URL actualUrl = urlBuilder.build();
        assertEquals("https://example.com/path?test=123", actualUrl.toString());
    }

}