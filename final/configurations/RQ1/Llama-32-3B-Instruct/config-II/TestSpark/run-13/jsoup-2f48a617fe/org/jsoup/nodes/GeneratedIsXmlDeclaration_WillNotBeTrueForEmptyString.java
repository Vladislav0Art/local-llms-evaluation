package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_WillNotBeTrueForEmptyString {

    @Test
    public void isXmlDeclaration_WillNotBeTrueForEmptyString() {
        // given
        String data = "";

        // when
        boolean result = comment.isXmlDeclaration();

        // then
        assertFalse(result);
    }

}