package org.jsoup.nodes;

public class GeneratedIsXmlDeclaration_commentWithoutValidData_isFalse {

    @Test
    public void isXmlDeclaration_commentWithoutValidData_isFalse() {
        // given
        String data = "This is not an XML declaration";
        Comment comment = new Comment(data);

        // when
        boolean result = comment.isXmlDeclaration();

        // then
        assertFalse(result);
    }

}