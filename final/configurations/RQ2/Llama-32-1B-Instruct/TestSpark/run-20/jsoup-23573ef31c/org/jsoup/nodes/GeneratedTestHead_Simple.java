package org.jsoup.nodes;

public class GeneratedTestHead_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testHead_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Element head = document.head();
        Assert.assertNotNull(head);
    }

}