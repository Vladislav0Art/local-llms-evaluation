package org.jsoup.nodes;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        String text = "Text";
        document.text(text);
        assertEquals(text, document.text());
    }

}