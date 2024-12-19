package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_CastsCommentToXmlDeclarationForValidData {

    private static final String EMPTY_COMMENT = "<!-- -->";

    @Test
    public void asXmlDeclaration_CastsCommentToXmlDeclarationForValidData() throws IOException {
        Comment comment = new Comment("!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration.isXmlDeclaration());
    }

}