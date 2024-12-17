package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclarationNoMatch {

    @Test
    public void testAsXmlDeclarationNoMatch() {
        Comment comment = new Comment("#comment");
        assertNull(comment.asXmlDeclaration());
    }

}