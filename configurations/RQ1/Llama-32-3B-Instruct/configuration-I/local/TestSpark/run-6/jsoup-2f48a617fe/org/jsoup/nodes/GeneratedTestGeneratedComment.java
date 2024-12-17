package org.jsoup.nodes;

public class GeneratedTestGeneratedComment {

    @Test
    public void testGeneratedComment() {
        Comment comment = new XmlDeclaration("html");
        Comment clonedComment = new XmlDeclaration(comment);
        assertTrue(clonedComment.isXmlDeclaration());
        assertEquals("html", clonedComment.asXmlDeclaration().getTagName());
        assertNull(clonedComment.asXmlDeclaration());
        assertNotNull(comment);
    }

}