package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnCorrectXmlDeclarationForValidInput {

    @Test
    public void asXmlDeclarationShouldReturnCorrectXmlDeclarationForValidInput() throws IOException {
        String data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        Comment comment = new Comment(data);
        XmlDeclaration expectedDeclarartion = mock(XmlDeclaration.class);
        assertSame(expectedDeclarartion, comment.asXmlDeclaration());
    }

}