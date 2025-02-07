package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private Document document;
    private ParseSettings parseSettings;

    @Test
    public void testOuterHtmlTail() throws IOException {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        document = new Document();
        parseSettings = document.getParseSettings();
        appendComment(comment, 1, 3, parseSettings);
        assertEquals("<br><!-- comment --><br>", comment.outerHtmlTail(document, 1, parseSettings));
    }

}