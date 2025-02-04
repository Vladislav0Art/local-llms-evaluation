package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationShouldBeFalseForNormalComments {

    private Comment comment;

    @Test
    public void isXmlDeclarationShouldBeFalseForNormalComments() {
        comment = new Comment("This is a test comment");
        assertFalse(comment.isXmlDeclaration());
    }

}