package org.jsoup.parser;

public class GeneratedTestInsertNode_1 {

    @Test
    public void testInsertNode_1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilderImpl();
        Node node = xmlTreeBuilder.parseFragment("<fragment>", "", "http://example.com/baseUri", null).node(0);
        xmlTreeBuilder.insertNode(node, "http://example.com/uri");
        assert xmlTreeBuilder.result.contains(" - fragment: <fragment>");
    }

}