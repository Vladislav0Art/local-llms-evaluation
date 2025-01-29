package org.jsoup.helper;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() {
        String inputKv = "key=value";
        String inputKey = "key1";
        String inputVal = "value1";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        URLBuilder.AppendKeyVal(urlBuilder, inputKv);
        String expectedKv = "key=1&val=value1";
        assertEquals(expectedKv, urlBuilder.appendKeyVal(inputKv).toString());
    }

}