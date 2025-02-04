package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_WillNotBeTrueForNonCommentData {

    @Test
    public void isXmlDeclaration_WillNotBeTrueForNonCommentData() {
        // given
        String data = "some text";

        // when
        boolean result = comment.isXmlDeclaration();

        // then
        assertFalse(result);
    }

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("<some>comment</some>");
    }

}