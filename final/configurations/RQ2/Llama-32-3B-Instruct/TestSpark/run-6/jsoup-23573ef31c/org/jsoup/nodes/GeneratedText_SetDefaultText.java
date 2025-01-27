package org.jsoup.nodes;

public class GeneratedText_SetDefaultText {

    @Test
    public void text_SetDefaultText() {
        String html = "<html><body>Document</body></html>";
        Document document = new Document(html);
        assertEquals("Document", document.text());
    }

}