package org.jsoup.helper;

public class GeneratedAppendKeyVal_NullKeyScenario {

    @Test
    public void appendKeyVal_NullKeyScenario() {
        String inputKey = null;
        Connection.KeyVal kv = new Connection.KeyVal(inputKey, "");
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);
        try {
            URL actualUrl = urlBuilder.build();
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}