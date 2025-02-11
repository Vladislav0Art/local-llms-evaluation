package org.jsoup.parser;

public class GeneratedParseValidXmlWithDoctype {

    private static final String XML_STRING = "<root><child>text</child></root>";
    private static final String EMPTY_STRING = "";
    private static final String DOCTYPE_STRING = "<!DOCTYPE root SYSTEM \"path/to/doctype\">";

    @Test
    public void parseValidXmlWithDoctype() throws IOException {
        StringReader reader = new StringReader(DOCTYPE_STRING + XML_STRING);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(reader, "");
        assertNotNull(doc);
        assertEquals("root", doc.nodeName());
        List<Node> children = doc.childNodes();
        assertNotNull(children);
        assertEquals(1, children.size());
        Node child = children.get(0);
        assertEquals("child", child.nodeName());
        assertTrue(child instanceof Element);
    }

}