package org.jsoup.nodes;

public class GeneratedTestTitle {

    @Test
    public void testTitle() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        String title = document.title();
        assertEquals("Example Page", title);
    }

}