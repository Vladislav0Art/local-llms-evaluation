package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        // Arrange
        String content = "xml version=\"1.0\" encoding=\"UTF-8\"?\n\nThis is an example XML declaration.";

        when(comment.getData()).thenReturn(content);

        // Act
        Comment xmlDeclaration = new Comment(content);
        XmlDeclaration xmlDeclarationMock = mock(XmlDeclaration.class);

        when(xmlDeclarationMock.asXmlDeclaration()).thenReturn(xmlDeclaration);

        // Assert
        assertEquals(xmlDeclaration, comment.asXmlDeclaration());
    }

}