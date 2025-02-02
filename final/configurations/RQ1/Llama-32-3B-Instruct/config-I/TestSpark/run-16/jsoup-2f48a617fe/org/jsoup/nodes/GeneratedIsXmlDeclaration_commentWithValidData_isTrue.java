package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_commentWithValidData_isTrue {

    @Test
    public void isXmlDeclaration_commentWithValidData_isTrue() {
        // given
        String data = "!DOCTYPE comment";
        Comment comment = new Comment(data);

        // when
        boolean result = comment.isXmlDeclaration();

        // then
        assertTrue(result);
    }

}