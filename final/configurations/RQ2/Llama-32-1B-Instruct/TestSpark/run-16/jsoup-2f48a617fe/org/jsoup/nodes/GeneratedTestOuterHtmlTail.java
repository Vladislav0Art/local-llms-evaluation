package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private LeafNode comment;

    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        StringBuilder builder = new StringBuilder();
        append(builder, comment.outerHtmlTail("UTF-8", ParseSettings.DEFAULT));
        String result = builder.toString();
        assertEquals("<!-- This is a comment -->", result);
    }

    private void append(StringBuilder builder, Comment comment) {
        builder.append(comment.outerHtmlHead(ParseSettings.DEFAULT, ParseSettings.DEFAULT, new Document.OutputSettings()));
        builder.append(comment.outerHtmlTail(ParseSettings.DEFAULT, ParseSettings.DEFAULT));
        builder.append(comment.toString());
    }

}