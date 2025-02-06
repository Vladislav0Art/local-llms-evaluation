package org.jsoup.nodes;

public class GeneratedCharsetSetterShouldSetCorrectCharset {

    @Test
    public void charsetSetterShouldSetCorrectCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("https://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}