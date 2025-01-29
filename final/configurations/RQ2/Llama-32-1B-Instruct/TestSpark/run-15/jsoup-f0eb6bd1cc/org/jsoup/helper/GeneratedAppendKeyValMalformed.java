package org.jsoup.helper;

public class GeneratedAppendKeyValMalformed {

    @Test
    public void appendKeyValMalformed() {
        String inputKv = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected MalformedURLException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

}