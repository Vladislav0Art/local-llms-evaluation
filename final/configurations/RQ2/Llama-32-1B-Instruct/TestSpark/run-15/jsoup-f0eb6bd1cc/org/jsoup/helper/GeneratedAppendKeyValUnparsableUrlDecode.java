package org.jsoup.helper;

public class GeneratedAppendKeyValUnparsableUrlDecode {

    @Test
    public void appendKeyValUnparsableUrlDecode() throws UnsupportedEncodingException {
        String inputKv = "key=abc";
        String inputKey = "key1";
        String inputVal = "value1";

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

}