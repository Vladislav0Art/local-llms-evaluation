package org.jsoup.nodes;

public class GeneratedCharsetDocument_setCharsetMethodSetsCharset {

    @Test
    public void charsetDocument_setCharsetMethodSetsCharset() {
        String expectedCharset = "UTF-8";
        Charset expectedCharsetEncoder = mock(CharsetEncoder.class);
        when(expectedCharsetEncoder.toString()).thenReturn("UTF-8");
        Document document = new Document("");
        assertEquals(expectedCharset, document.charset(expectedCharset));
    }

}