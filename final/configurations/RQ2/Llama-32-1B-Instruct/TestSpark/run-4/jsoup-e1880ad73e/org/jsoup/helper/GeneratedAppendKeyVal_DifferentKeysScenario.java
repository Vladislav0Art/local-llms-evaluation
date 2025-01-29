package org.jsoup.helper;

public class GeneratedAppendKeyVal_DifferentKeysScenario {

    @Test
    public void appendKeyVal_DifferentKeysScenario() {
        String inputKey1 = "test1";
        String inputValue1 = "123";
        String inputKey2 = "test2";
        String inputValue2 = "456";
        Connection.KeyVal kv1 = new Connection.KeyVal(inputKey1, inputValue1);
        Connection.KeyVal kv2 = new Connection.KeyVal(inputKey2, inputValue2);
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        URL actualUrl = urlBuilder.build();
        assertEquals("https://example.com/path?test1=123&test2=456", actualUrl.toString());
    }

}