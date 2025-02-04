package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_ReturnsXmlDeclarationIfParsingSucceeds {

    @Test
    public void asXmlDeclaration_ReturnsXmlDeclarationIfParsingSucceeds() throws IOException {
        String fragment = "<!DOCTYPE html>";
        Comment comment = new Comment(fragment);
        XmlDeclaration result = comment.asXmlDeclaration();
        assertNotNull(result);
    }

}