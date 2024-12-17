package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclarationEmptyDataReturnsNull {

    @Test
    public void testAsXmlDeclarationEmptyDataReturnsNull() {
        Leaf xmlDecl = new XmlDeclaration();
        assertNull(xmlDecl.asXmlDeclaration());
    }

}