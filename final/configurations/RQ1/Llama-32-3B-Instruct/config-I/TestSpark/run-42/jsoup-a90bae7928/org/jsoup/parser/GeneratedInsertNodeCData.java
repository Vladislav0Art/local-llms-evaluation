package org.jsoup.parser;

public class GeneratedInsertNodeCData {

    private static final String XML_STRING = "<root><child>text</child></root>";
    private static final String EMPTY_STRING = "";
    private static final String DOCTYPE_STRING = "<!DOCTYPE root SYSTEM \"path/to/doctype\">";

    @Test
    public void insertNodeCData() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Node node = new CDataNode("Hello World");
        builder.insertNode(node);
        assertNotNull(builder.currentElement());
    }

}