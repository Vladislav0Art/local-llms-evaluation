package org.jsoup.nodes;

public class GeneratedTitle_test {

    @Test
    public void title_test() {
        String title = "Example Title";
        Document document = new Document("http://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

}