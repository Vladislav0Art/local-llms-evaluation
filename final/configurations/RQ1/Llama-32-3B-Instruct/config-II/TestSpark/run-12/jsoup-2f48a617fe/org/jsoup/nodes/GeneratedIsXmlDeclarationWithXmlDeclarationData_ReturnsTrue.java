package org.jsoup.nodes;

public class GeneratedIsXmlDeclarationWithXmlDeclarationData_ReturnsTrue {

    @Test
    public void isXmlDeclarationWithXmlDeclarationData_ReturnsTrue() {
        // given
        String data = "This is an XML Declaration";

        Comment comment = new Comment(data);

        // when
        boolean result = comment.isXmlDeclaration();

        // then
        assertTrue(result);
    }

}