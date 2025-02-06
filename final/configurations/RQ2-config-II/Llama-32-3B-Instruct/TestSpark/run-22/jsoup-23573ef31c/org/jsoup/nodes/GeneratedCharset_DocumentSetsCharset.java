package org.jsoup.nodes;

public class GeneratedCharset_DocumentSetsCharset {

    @Test
    public void charset_DocumentSetsCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("https://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}