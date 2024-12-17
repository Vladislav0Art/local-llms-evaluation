package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationMethodShouldReturnNullIfDataDoesNotStartWithQuestionMarkOrExclamationSign {

    @Test
    public void asXmlDeclarationMethodShouldReturnNullIfDataDoesNotStartWithQuestionMarkOrExclamationSign() {
        Comment comment = new Comment("?This is a test");
        assertNull(comment.asXmlDeclaration());
    }

}