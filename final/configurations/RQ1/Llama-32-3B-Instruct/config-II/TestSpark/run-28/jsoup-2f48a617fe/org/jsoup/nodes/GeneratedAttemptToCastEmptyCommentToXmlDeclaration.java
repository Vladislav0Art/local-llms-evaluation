package org.jsoup.nodes;

public class GeneratedAttemptToCastEmptyCommentToXmlDeclaration {

    @Test
    public void attemptToCastEmptyCommentToXmlDeclaration() {
        Comment comment = new Comment("");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

}