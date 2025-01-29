package org.jsoup.nodes;

public class GeneratedTestCreateShell_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testCreateShell_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Assert.assertNotNull(document);
    }

}