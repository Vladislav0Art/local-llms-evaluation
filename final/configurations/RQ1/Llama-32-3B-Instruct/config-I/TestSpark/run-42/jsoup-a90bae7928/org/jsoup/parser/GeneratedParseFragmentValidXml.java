package org.jsoup.parser;

public class GeneratedParseFragmentValidXml {

    private static final String XML_STRING = "<root><child>text</child></root>";
    private static final String EMPTY_STRING = "";
    private static final String DOCTYPE_STRING = "<!DOCTYPE root SYSTEM \"path/to/doctype\">";

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

}