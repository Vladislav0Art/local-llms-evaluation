package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_ParseInputFragmentWorksCorrectly {

    @Test
    public void AsXmlDeclaration_ParseInputFragmentWorksCorrectly() throws IOException {
        Comment comment = new Comment("This is a test comment");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl != null && !comment.isXmlDeclaration());
    }

}