package org.jsoup.nodes;

public class GeneratedToStringShouldReturnXmlCommentDeclaration {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void toStringShouldReturnXmlCommentDeclaration() {
        Comment comment = new Comment(COMMENT_DATA);
        String expectedOutput = "<!-- " + COMMENT_DATA + " -->";
        assertEquals(expectedOutput, comment.toString());
    }

}