package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_returnsCorrectDeclaration {

    @Test
    public void asXmlDeclaration_returnsCorrectDeclaration() throws IOException {
        String data = "Data";
        Comment comment = new Comment(data);
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
        assertEquals(data.substring(1, data.length() - 1), declaration.getValue());
        assertTrue(declaration.getPrefix().equals("xml"));
    }

}