package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationIsCorrectForNonEmptyDeclaration {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void isXmlDeclarationIsCorrectForNonEmptyDeclaration() {
        Comment comment = new Comment("This is a declaration.");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

}