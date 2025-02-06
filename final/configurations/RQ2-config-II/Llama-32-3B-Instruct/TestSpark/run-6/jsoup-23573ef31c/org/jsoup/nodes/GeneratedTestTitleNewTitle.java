package org.jsoup.nodes;

public class GeneratedTestTitleNewTitle {

    @Test
    public void testTitleNewTitle() {
        String title = "new Title";
        Document document = new Document("");
        document.title(title);
        assertEquals(title, document.title());
    }

}