package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_CastsCommentToXmlDeclarationForInvalidData {

    private static final String EMPTY_COMMENT = "<!-- -->";

    @Test
    public void asXmlDeclaration_CastsCommentToXmlDeclarationForInvalidData() throws IOException {
        Comment comment = new Comment("Invalid data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

}