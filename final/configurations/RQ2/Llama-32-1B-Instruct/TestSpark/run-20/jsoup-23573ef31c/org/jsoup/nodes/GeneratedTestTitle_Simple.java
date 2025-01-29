package org.jsoup.nodes;

public class GeneratedTestTitle_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testTitle_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        String title = "Test Title";
        document.title(title);
        assertEquals(title, document.title());
    }

}