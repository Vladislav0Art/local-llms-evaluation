package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationIsCorrectForEmptyDeclaration {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void isXmlDeclarationIsCorrectForEmptyDeclaration() {
        Assert.assertFalse(Comment.isXmlDeclaration(EMPTY_DECLARATION));
    }

}