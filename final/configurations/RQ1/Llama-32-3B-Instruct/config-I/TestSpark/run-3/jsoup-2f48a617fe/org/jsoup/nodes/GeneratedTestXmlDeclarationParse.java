package org.jsoup.nodes;

public class GeneratedTestXmlDeclarationParse {

    @Test
    public void testXmlDeclarationParse() {
        Parser parser = new Parser();
        XmlDeclaration xmlDeclaration = parser.xmlParser().parseInput("<declaration/>");
        assertNotNull(xmlDeclaration);
        assertEquals("declaration", xmlDeclaration.getName());
    }

}