package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    private static final Comment COMMENT = new Comment("This is an example comment");

    @Test
    public void testAsXmlDeclaration() throws IOException {
        String data = "This is an example comment";
        Comment comment = COMMENT.asXmlDeclaration();
        // We should not be able to parse it as XML.
        assertNull(comment.asXmlDeclaration());
    }

}