package org.jsoup.nodes;

public class GeneratedText {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void text() throws Exception {
        Document doc = createDocument(BASE_URI);
        String text = "Hello World!";
        doc.text(text);
        assertEquals(text, doc.text());
    }

}