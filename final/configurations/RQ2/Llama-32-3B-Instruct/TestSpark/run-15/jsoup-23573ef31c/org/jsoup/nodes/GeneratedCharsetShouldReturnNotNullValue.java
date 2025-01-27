package org.jsoup.nodes;

public class GeneratedCharsetShouldReturnNotNullValue {

    @Test
    public void charsetShouldReturnNotNullValue() {
        Document document = Document.createShell("https://example.com");
        Charset charset = document.charset();
        assertNotNull(charset);
    }

}