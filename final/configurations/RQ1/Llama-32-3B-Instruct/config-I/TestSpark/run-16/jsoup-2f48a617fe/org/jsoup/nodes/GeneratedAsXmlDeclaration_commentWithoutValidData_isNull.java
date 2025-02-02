package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_commentWithoutValidData_isNull {

    @Test
    public void asXmlDeclaration_commentWithoutValidData_isNull() {
        // given
        String data = "This is not an XML declaration";
        Comment comment = new Comment(data);

        // when
        @Nullable XmlDeclaration result = comment.asXmlDeclaration();

        // then
        assertNull(result);
    }

}