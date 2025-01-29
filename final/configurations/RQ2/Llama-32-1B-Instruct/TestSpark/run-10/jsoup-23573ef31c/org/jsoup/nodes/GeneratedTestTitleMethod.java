package org.jsoup.nodes;

public class GeneratedTestTitleMethod {

    @Test
    public void testTitleMethod() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

}