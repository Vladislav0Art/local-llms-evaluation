package org.jsoup.parser;

public class GeneratedParse_ValidXmlReader_ValidDocument {

    @Test
    public void parse_ValidXmlReader_ValidDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        Document document = builder.parse(new StringReader("<root><child/></root>"), settings);
        assertNotNull(document);
        assertEquals("root", document.title());
    }

}