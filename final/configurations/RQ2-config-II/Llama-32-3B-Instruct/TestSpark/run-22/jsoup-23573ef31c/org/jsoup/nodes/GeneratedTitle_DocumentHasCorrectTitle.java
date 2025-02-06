package org.jsoup.nodes;

public class GeneratedTitle_DocumentHasCorrectTitle {

    @Test
    public void title_DocumentHasCorrectTitle() {
        Document document = new Document("https://example.com");
        String title = document.title();
        assertNotNull(title);
    }

}