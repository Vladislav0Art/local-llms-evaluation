package org.jsoup.nodes;

public class GeneratedTestHtmlPreserveCase {

    @Test
    public void testHtmlPreserveCase() {
        Parser parser = new Parser();
        ParseSettings settings = new ParseSettings(true);
        Document document = parser.htmlParser().settings(settings).parseInput("<data>", "baseUri()");
        assertTrue(document.toString().contains("data"));
    }

}