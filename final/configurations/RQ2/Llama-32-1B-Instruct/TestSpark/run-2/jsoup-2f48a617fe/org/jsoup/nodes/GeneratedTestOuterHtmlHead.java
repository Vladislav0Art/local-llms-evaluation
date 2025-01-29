package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private static final Comment COMMENT = new Comment("This is a comment.");

    public static void testIsXmlDeclaration() {
        assertEquals(true, COMMENT.isXmlDeclaration());
    }

    public static void testAsXmlDeclaration() {
        assertEquals("http://example.com/comments.Xml", COMMENT.asXmlDeclaration().toString());
    }

    public static void testToString() {
        String result = COMMENT.toString();
        assertEquals("<Comment> This is a comment.</Comment>", result);
    }

    public static void testNodeName() {
        assertEquals("comment", COMMENT.nodeName());
    }

    public static void testData() {
        assertEquals("This is a comment.", COMMENT.getData());
    }

    public static void testsetData() {
        COMMENT.setData("New data.");
        assertEquals("New data.", COMMENT.getData());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = new Document();
        Appendable accum = document.getOutput(0);
        COMMENT.outerHtmlHead(accum, 1, ParseSettings.FOLLOW_ALL_SAX_TOKENS);
        assertEquals("<Comment>", accum.toString());
    }

}