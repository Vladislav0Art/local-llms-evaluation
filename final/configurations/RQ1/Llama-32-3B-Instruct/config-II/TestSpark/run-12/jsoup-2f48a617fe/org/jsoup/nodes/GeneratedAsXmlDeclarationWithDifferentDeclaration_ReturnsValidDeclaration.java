package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationWithDifferentDeclaration_ReturnsValidDeclaration {

    @Test
    public void asXmlDeclarationWithDifferentDeclaration_ReturnsValidDeclaration() {
        // given
        String data = "This is an XML Declaration";

        Comment comment = new Comment(data);

        XmlDeclaration decl = mock(XmlDeclaration.class);

        // when
        XmlDeclaration result = comment.asXmlDeclaration();

        // then
        assertEquals(decl, result);
    }

}