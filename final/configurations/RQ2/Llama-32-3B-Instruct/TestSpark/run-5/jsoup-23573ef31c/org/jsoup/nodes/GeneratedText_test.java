package org.jsoup.nodes;

public class GeneratedText_test {

    @Test
    public void text_test() {
        Document document = new Document("http://example.com");
        String text = document.text("");
        assertEquals("", text);
    }

}