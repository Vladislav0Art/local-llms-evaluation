package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    @Test
    public void testAsXmlDeclaration() {
        String data = "This is a comment";
        XmlDeclaration decl = null;
        Comment comment = new Comment("#comment");
        Object result = comment.asXmlDeclaration();
        if (result instanceof XmlDeclaration) {
            assertEquals(decl, ((XmlDeclaration) result).getData());
        }
    }

}