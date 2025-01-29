package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private LeafNode comment;

    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        StringBuilder builder = new StringBuilder();
        append(builder, comment.outerHtmlHead("UTF-8", ParseSettings.DEFAULT, new Document.OutputSettings()));
        String result = builder.toString();
        assertEquals("<!-- This is a comment -->", result);
    }

}