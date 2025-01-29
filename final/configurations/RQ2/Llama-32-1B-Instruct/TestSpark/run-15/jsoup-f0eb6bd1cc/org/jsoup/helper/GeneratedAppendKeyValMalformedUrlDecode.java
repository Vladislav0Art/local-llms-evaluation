package org.jsoup.helper;

public class GeneratedAppendKeyValMalformedUrlDecode {

    @Test
    public void appendKeyValMalformedUrlDecode() throws UnsupportedEncodingException {
        String inputKv = "key=abc";
        String inputKey = "key1";
        String inputVal = "value1";

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected MalformedURLException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

}