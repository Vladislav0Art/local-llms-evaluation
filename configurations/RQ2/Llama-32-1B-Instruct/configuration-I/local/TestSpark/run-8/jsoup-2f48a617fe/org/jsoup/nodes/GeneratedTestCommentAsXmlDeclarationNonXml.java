package org.jsoup.nodes;

public class GeneratedTestCommentAsXmlDeclarationNonXml {


    private Comment comment;

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentAsXmlDeclarationNonXml() {
        String data = "Example text";
        comment = new Comment(data);
        XmlDeclaration xmlDeclaration = (XmlDeclaration) comment.asXmlDeclaration();
        assertEquals(null, xmlDeclaration);
    }

}