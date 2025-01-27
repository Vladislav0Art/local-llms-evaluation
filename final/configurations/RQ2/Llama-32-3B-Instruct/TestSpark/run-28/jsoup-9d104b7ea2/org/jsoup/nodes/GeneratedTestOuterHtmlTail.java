package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private static final String DEFAULT = "DEFAULT";

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        boolean result = document.outerHtmlTail(outContent, 0, DEFAULT);
        assertTrue(result);
    }

}