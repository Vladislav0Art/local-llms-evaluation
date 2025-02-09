package org.jsoup.nodes;

public class GeneratedTestTitleSetAndGetSetsAndGetsTitle {

    @Test
    public void testTitleSetAndGetSetsAndGetsTitle() {
        Document document = new Document();
        document.setTitle("title");
        String title = document.getTitle();
        assertTrue(title.equals("title"));
    }

}