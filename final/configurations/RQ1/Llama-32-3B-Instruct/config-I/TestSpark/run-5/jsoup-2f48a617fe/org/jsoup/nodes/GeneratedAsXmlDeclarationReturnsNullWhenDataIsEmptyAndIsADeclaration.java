package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullWhenDataIsEmptyAndIsADeclaration {

    private static final String EMPTY_COMMENT = "#comment";

    @Test
    public void asXmlDeclarationReturnsNullWhenDataIsEmptyAndIsADeclaration() {
        String declContent = "";
        XmlDeclaration decl = Comment.asXmlDeclaration("!" + declContent + "!");
        Assert.assertNull(decl);
    }

}