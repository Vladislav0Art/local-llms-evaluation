package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_ReturnsTrueForValidData {

    private static final String EMPTY_COMMENT = "<!-- -->";

    @Test
    public void isXmlDeclaration_ReturnsTrueForValidData() {
        Comment comment = new Comment("!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"");
        assertTrue(comment.isXmlDeclaration());
    }

}