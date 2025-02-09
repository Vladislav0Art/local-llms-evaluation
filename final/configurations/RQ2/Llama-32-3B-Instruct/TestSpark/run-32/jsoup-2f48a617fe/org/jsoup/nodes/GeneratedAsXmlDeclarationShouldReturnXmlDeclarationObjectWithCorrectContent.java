package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldReturnXmlDeclarationObjectWithCorrectContent {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void asXmlDeclarationShouldReturnXmlDeclarationObjectWithCorrectContent() {
        XmlDeclaration xmlDeclaration = mock(XmlDeclaration.class);
        when(xmlDeclaration.length()).thenReturn("<xml>Declaration</xml>".length());
        Comment comment = new Comment("<xml>Declaration</xml>");
        XmlDeclaration actualXmlDeclaration = comment.asXmlDeclaration();
        verify(xmlDeclaration).length(anyInt());
    }

}