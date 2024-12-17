package org.jsoup.helper;

public class GeneratedAppendKeyVal_givenInvalidEncoding_throwsUnsupportedEncodingException {

    @Test
    public void appendKeyVal_givenInvalidEncoding_throwsUnsupportedEncodingException() {
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(new URL("http://example.com/path")).appendKeyVal(new Connection.KeyVal("key", "value")));
    }

}