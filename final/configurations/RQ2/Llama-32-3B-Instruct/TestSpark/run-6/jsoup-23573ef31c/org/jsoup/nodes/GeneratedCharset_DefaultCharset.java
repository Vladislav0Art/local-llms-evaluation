package org.jsoup.nodes;

public class GeneratedCharset_DefaultCharset {

    @Test
    public void charset_DefaultCharset() {
        String html = "<html><head><meta charset='UTF-8'></head></html>";
        Document document = new Document(html);
        assertEquals("UTF-8", document.charset());
    }

}