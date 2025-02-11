package org.jsoup.helper;

public class GeneratedDecodePartDoesNotThrowUnsupportedEncodingException {

    @Test
    public void decodePartDoesNotThrowUnsupportedEncodingException() {
        assertEquals("test", UrlBuilder.decodePart("test").toString());
    }

}