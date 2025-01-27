package org.jsoup.nodes;

public class GeneratedText_SetText {

    @Test
    public void text_SetText() {
        String html = "<html><body>Document Text</body></html>";
        Document document = new Document(html);
        document.text("New Text");
        assertEquals("New Text", document.text());
    }
}

}