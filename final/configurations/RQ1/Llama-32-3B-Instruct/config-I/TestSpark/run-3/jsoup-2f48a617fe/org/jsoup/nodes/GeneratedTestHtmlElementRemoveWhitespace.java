package org.jsoup.nodes;

public class GeneratedTestHtmlElementRemoveWhitespace {

    @Test
    public void testHtmlElementRemoveWhitespace() {
        Parser parser = new Parser();
        ParseSettings settings = new ParseSettings(false);
        Document document = parser.htmlParser().settings(settings).parseInput("<element>   </element>", "baseUri()");
        assertTrue(document.toString().contains("element"));
    }

}