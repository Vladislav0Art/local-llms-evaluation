package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationTreatsTailCommentsAsComment {

    @Test
    public void asXmlDeclarationTreatsTailCommentsAsComment() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

}