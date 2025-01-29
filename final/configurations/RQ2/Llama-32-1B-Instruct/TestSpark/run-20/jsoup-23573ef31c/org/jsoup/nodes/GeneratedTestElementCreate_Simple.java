package org.jsoup.nodes;

public class GeneratedTestElementCreate_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testElementCreate_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Element element = document.createElement("div");
        Assert.assertNotNull(element);
    }

}