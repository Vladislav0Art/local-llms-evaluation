package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationReturnsFalse {

    private static final String TEST_DATA = "Test Data";

    @Test
    public void isXmlDeclarationReturnsFalse() {
        Comment comment = new Comment(TEST_DATA);
        assertFalse(comment.isXmlDeclaration());
    }

}