package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private Document document;
    private ParseSettings parseSettings;

    @Test
    public void testOuterHtmlHead() throws IOException {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        document = new Document();
        parseSettings = document.getParseSettings();
        appendComment(comment, 0, 1, parseSettings);
        assertEquals("<!-- comment --><br>", comment.outerHtmlHead(document, 0, parseSettings));
    }

}