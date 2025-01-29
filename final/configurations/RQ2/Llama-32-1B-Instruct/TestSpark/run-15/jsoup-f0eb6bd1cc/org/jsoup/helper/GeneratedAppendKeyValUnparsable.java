package org.jsoup.helper;

public class GeneratedAppendKeyValUnparsable {

    @Test
    public void appendKeyValUnparsable() {
        String inputKv = "key=abc";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

}