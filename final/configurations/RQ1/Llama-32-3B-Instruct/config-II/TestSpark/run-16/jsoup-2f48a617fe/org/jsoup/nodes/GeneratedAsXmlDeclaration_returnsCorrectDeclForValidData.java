package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_returnsCorrectDeclForValidData {

    @Test
    public void asXmlDeclaration_returnsCorrectDeclForValidData() throws IOException {
        // Given
        String data = "<xml version=\"1.0\" xmlns=\"http://www.w3.org/1999/xhtml\"><root></root>";

        // When
        XmlDeclaration decl = new Comment(data).asXmlDeclaration();

        // Then
        assertNotNull(decl);
        assertEquals("xml", decl.tagName());
        assertTrue(decl.attributes().containsKey("xmlns"));
    }

}