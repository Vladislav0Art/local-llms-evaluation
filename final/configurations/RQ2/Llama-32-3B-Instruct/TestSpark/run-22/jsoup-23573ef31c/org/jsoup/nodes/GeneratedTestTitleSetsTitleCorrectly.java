package org.jsoup.nodes;

public class GeneratedTestTitleSetsTitleCorrectly {

    @Test
    public void testTitleSetsTitleCorrectly() {
        String originalTitle = "Original Title";
        Document document = new Document("https://example.com");
        document.setTitle(originalTitle);
        assertEquals(originalTitle, document.getTitle());
    }

}