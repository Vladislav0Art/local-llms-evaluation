package org.jsoup.nodes;

public class GeneratedTextWithNullValueTest_ReturnsEmptyString {

    @Test
    public void textWithNullValueTest_ReturnsEmptyString() {
        Document document = new Document("https://www.example.com");
        assertEquals("", document.text(null));
    }

}