package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullWhenNotANodeDeclaration {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void asXmlDeclarationReturnsNullWhenNotANodeDeclaration() {
        String data = "This is not a declaration.";
        Assert.assertNull(Comment.asXmlDeclaration(data));
    }

}