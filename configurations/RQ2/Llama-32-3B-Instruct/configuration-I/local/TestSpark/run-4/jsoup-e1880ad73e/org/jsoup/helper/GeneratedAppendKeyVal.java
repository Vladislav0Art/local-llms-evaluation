package org.jsoup.helper;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() {
        String url = "https://www.example.com?key1=value1&key2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        Connection.KeyVal[] keyVals = {new Connection.KeyVal("key3", "value3")};
        urlBuilder.appendKeyVal(keyVals);
        assertEquals("key3=value3", urlBuilder.build().getQuery());
    }

}