package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationCanParseCorrectly {

    @Test
    public void asXmlDeclarationCanParseCorrectly() throws IOException {
        Comment comment = new Comment("This is an XML declaration comment.");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals(comment.getData(), decl.data());
    }

}