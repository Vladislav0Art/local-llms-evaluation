package org.jsoup.nodes;

public class GeneratedTestCharsetSetsCharsetCorrectly {

    @Test
    public void testCharsetSetsCharsetCorrectly() {
        Charset originalCharset = Charset.forName("UTF-8");
        Document document = new Document("https://example.com");
        document.setCharset(originalCharset);
    }

}