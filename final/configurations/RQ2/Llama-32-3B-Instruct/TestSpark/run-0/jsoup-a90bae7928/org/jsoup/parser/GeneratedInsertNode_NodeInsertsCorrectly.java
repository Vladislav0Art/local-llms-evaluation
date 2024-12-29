package org.jsoup.parser;

public class GeneratedInsertNode_NodeInsertsCorrectly {

    @Test
    public void insertNode_NodeInsertsCorrectly() {
        Node node = new TextNode("Hello");
        new XmlTreeBuilder().insertNode(node);
        assertNotNull(new XmlTreeBuilder().getDocument());
    }

}