package org.jsoup.parser;

public class GeneratedTest {

    private static final String XML_STRING = "<root><child>text</child></root>";
    private static final String EMPTY_STRING = "";
    private static final String DOCTYPE_STRING = "<!DOCTYPE root SYSTEM \"path/to/doctype\">";

    @Test
    public void initialiseParseDefaultSettings() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assert settings == ParseSettings.preserveCase;
    }

    @Test
    public void parseEmptyString() {
        Assert nullValue (XmlTreeBuilder.parse(EMPTY_STRING, ""));
    }

    @Test
    public void parseValidXml() throws IOException {
        StringReader reader = new StringReader(XML_STRING);
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

    @Test
    public void processCharacter() {
        Token token = new Token(Token.Character.class, "Hello World");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        boolean result = builder.process(token);
        assertTrue(result);
    }

    @Test
    public void insertNodeCData() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Node node = new CDataNode("Hello World");
        builder.insertNode(node);
        assertNotNull(builder.currentElement());
    }

    @Test
    public void popStackToCloseEndTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = new Element("root", null, null);
        builder.stack.add(element);
        Token token = new Token(Token.EndTag.class, "root");
        builder.popStackToClose(token);
        assertEquals(0, builder.stack.size());
    }

    @Test
    public void parseFragmentValidXml() throws IOException {
        StringReader reader = new StringReader(XML_STRING);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment(reader.toString(), "", new Parser());
        assertNotNull(result);
        assertEquals(1, result.size());
        Node child = result.get(0);
        assertEquals("child", child.nodeName());
        assertTrue(child instanceof Element);
    }

    @Test
    public void parseFragmentEmptyString() {
        StringReader reader = new StringReader(EMPTY_STRING);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment(reader.toString(), "", new Parser());
        assertEquals(0, result.size());
    }
}

class Parser {
}

}