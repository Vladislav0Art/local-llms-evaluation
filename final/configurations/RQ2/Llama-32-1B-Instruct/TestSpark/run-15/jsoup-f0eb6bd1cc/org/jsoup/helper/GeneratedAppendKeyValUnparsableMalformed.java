package org.jsoup.helper;

public class GeneratedAppendKeyValUnparsableMalformed {

    @Test
    public void appendKeyValUnparsableMalformed() {
        String inputKv = "key=abc";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        try {
            URLBuilder.AppendKeyVal(urlBuilder, inputKv);
            fail("Expected MalformedURLException");
        } catch (UnsupportedEncodingException e) {
            // Expected exception
        }
    }

}