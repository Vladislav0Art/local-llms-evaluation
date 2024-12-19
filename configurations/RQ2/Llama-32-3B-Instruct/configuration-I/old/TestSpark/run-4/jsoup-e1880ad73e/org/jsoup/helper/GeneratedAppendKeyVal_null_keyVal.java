package org.jsoup.helper;

public class GeneratedAppendKeyVal_null_keyVal {

    @Test
    public void appendKeyVal_null_keyVal() {
        String url = "https://www.example.com?key1=value1";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        Connection.KeyVal[] keyVals = {null};
        urlBuilder.appendKeyVal(keyVals);
    }

}