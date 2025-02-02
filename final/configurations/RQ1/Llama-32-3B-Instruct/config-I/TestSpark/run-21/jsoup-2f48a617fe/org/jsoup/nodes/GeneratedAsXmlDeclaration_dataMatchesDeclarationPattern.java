package org.jsoup.nodes;

public class GeneratedAsXmlDeclaration_dataMatchesDeclarationPattern {

    private static final String EMPTY_COMMENT = "#comment";
    private static final String DATA_COMMENT = "#comment> data</#comment>";
    private static final String XML_DECLARATION_DATA = "<!XML Declaration>";
    private static final String XML_DECLARATION_FRAGMENT = "<" + XML_DECLARATION_DATA + ">";
    private static final Document doc = new Document();
    private static final Comment comment = new Comment(DATA_COMMENT);

    @Test
    public void asXmlDeclaration_dataMatchesDeclarationPattern() {
        String data = DATA_COMMENT.substring(1, DATA_COMMENT.length() - 3);
        XmlDeclaration expected = new XmlDeclaration(data, true);
        assertEquals(expected, comment.asXmlDeclaration());
    }

}