package org.jsoup.nodes;

public class GeneratedCharsetDocument_getCharsetMethodReturnsCharset {

    @Test
    public void charsetDocument_getCharsetMethodReturnsCharset() {
        String expectedCharset = "UTF-8";
        Charset expectedCharsetEncoder = mock(CharsetEncoder.class);
        when(expectedCharsetEncoder.toString()).thenReturn("UTF-8");
        Document document = new Document("");
        assertEquals(expectedCharset, document.charset());
    }

}