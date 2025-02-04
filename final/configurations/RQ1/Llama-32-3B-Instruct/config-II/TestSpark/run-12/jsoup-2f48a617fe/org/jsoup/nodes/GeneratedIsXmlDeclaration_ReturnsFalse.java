package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_ReturnsFalse {

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        // given
        String data = "This is not an XML Declaration";

        Comment comment = new Comment(data);

        // when
        boolean result = comment.isXmlDeclaration();

        // then
        assertFalse(result);
    }

}