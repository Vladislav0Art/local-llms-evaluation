package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private static final String DEFAULT = "DEFAULT";

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        boolean result = document.outerHtmlHead(outContent, 0, DEFAULT);
        assertTrue(result);
    }

}