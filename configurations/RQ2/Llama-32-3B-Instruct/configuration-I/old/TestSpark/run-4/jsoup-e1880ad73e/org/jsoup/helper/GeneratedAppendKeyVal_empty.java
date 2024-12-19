package org.jsoup.helper;

public class GeneratedAppendKeyVal_empty {

    @Test
    public void appendKeyVal_empty() {
        String url = "https://www.example.com?key1=value1";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        Connection.KeyVal[] keyVals = {};
        urlBuilder.appendKeyVal(keyVals);
        assertEquals("", urlBuilder.build().getQuery());
    }

}