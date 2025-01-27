package org.jsoup.nodes;

public class GeneratedTitle_test {

    @Test
    public void title_test() {
        Document document = new Document("http://example.com");
        String title = document.title();
        assertEquals("", title);
    }

}