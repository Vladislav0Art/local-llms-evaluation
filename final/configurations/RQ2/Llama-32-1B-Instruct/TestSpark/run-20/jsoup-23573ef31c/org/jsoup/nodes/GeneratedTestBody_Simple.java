package org.jsoup.nodes;

public class GeneratedTestBody_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testBody_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Element body = document.body();
        Assert.assertNotNull(body);
    }

}