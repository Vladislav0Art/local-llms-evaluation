package org.jsoup.helper;

public class GeneratedAppendKeyVal_null_keyValue {

    @Test
    public void appendKeyVal_null_keyValue() {
        String url = "https://www.example.com?key1=value1";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        Connection.KeyVal[] keyVals = {new Connection.KeyVal("key2", null)};
        urlBuilder.appendKeyVal(keyVals);
    }

}