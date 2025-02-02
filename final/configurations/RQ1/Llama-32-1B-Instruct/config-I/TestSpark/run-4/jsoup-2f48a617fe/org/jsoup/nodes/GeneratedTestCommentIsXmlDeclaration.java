package org.jsoup.nodes;

public class GeneratedTestCommentIsXmlDeclaration {

    @Test
    public void testCommentIsXmlDeclaration() {
        String data = "!xml declaration";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

    private Document createDocument() throws IOException {
        // Create a basic HTML document with a comment node at the end.
        ParseSettings settings = ParseSettings.preserveCase;
        Parser parser = Parser.htmlParser();
        Document document = parser.settings(settings).parseInput("<!--Hello, world!-->", new URL("http://example.com/baseuri"));
        return document;
    }

}