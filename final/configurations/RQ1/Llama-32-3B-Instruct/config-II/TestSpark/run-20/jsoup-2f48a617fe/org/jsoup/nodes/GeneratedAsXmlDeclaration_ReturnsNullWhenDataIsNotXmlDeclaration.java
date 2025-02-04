package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_ReturnsNullWhenDataIsNotXmlDeclaration {

    @Test
    public void asXmlDeclaration_ReturnsNullWhenDataIsNotXmlDeclaration() throws IOException {
        String fragment = "<p>Hello World</p>";
        Comment comment = new Comment(fragment);
        assertNull(comment.asXmlDeclaration());
    }

}