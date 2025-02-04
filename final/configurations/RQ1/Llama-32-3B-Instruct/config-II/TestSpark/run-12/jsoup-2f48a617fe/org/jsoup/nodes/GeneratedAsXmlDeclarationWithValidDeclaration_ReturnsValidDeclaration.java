package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationWithValidDeclaration_ReturnsValidDeclaration {

    @Test
    public void asXmlDeclarationWithValidDeclaration_ReturnsValidDeclaration() {
        // given
        String data = "This is an XML Declaration";

        Comment comment = new Comment(data);

        // when
        XmlDeclaration result = comment.asXmlDeclaration();

        // then
        assertNotNull(result);
        assertTrue(result.isXmlDeclaration());
    }

}