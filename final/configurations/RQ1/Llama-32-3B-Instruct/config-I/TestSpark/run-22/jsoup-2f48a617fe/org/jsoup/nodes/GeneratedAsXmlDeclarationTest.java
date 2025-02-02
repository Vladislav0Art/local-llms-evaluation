package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!This is an XML Declaration");
        assertNull(comment.asXmlDeclaration());

        XmlDeclaration decl = new XmlDeclaration("root", true);
        Comment commentWithDecl = new Comment("<!DOCTYPE root SYSTEM \"http://example.com/root.dtd\">");
        assertNotNull(commentWithDecl.asXmlDeclaration());
    }

}