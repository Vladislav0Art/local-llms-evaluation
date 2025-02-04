package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration ReturnsNullWhenNoValidDeclaration {

    @Test
    public void asXmlDeclaration

    ReturnsNullWhenNoValidDeclaration() {
        // given
        String data = "This is not an XML Declaration";

        Comment comment = new Comment(data);

        // when
        XmlDeclaration result = comment.asXmlDeclaration();

        // then
        assertNull(result);
    }

}