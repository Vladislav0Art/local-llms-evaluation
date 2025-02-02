package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_commentWithValidData_isNull {

    @Test
    public void asXmlDeclaration_commentWithValidData_isNull() {
        // given
        String data = "This is a valid XML declaration";
        Comment comment = new Comment(data);

        // when
        @Nullable XmlDeclaration result = comment.asXmlDeclaration();

        // then
        assertNull(result);
    }

}