package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsFalseAndIsNotNull {

    private static final String TEST_DATA = "test data";

    @Test
    public void isXmlDeclarationReturnsFalseAndIsNotNull() {
        Comment comment = new Comment("");
        boolean isXmlDeclaration = comment.isXmlDeclaration();
        assertNotNull(isXmlDeclaration);
        assertFalse(isXmlDeclaration);
    }

}