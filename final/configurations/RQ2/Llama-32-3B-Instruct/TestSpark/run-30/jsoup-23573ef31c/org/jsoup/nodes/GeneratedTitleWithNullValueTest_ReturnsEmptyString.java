package org.jsoup.nodes;

public class GeneratedTitleWithNullValueTest_ReturnsEmptyString {

    @Test
    public void titleWithNullValueTest_ReturnsEmptyString() {
        Document document = new Document("https://www.example.com");
        assertEquals("", document.title(null));
    }

}