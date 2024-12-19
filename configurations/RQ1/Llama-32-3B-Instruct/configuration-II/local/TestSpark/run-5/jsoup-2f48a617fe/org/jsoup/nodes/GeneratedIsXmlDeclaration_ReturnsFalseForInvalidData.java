package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_ReturnsFalseForInvalidData {

    private static final String EMPTY_COMMENT = "<!-- -->";

    @Test
    public void isXmlDeclaration_ReturnsFalseForInvalidData() {
        Comment comment = new Comment("Invalid data");
        assertFalse(comment.isXmlDeclaration());
    }

}