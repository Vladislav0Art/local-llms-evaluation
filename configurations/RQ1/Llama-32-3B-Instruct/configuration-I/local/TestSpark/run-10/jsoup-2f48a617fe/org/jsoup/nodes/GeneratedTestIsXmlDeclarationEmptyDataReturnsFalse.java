package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclarationEmptyDataReturnsFalse {

    @Test
    public void testIsXmlDeclarationEmptyDataReturnsFalse() {
        Leaf xmlDecl = new XmlDeclaration();
        assertFalse(xmlDecl.isXmlDeclaration());
    }

}