package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationShouldNotCreateCommentIfItIsAlreadyAnXmlDeclaration {

    @Test
    public void asXmlDeclarationShouldNotCreateCommentIfItIsAlreadyAnXmlDeclaration() {
        String data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        Comment comment = new Comment(data);
        XmlDeclaration decl = mock(XmlDeclaration.class);
        assertEquals(decl, comment.asXmlDeclaration());
    }

}