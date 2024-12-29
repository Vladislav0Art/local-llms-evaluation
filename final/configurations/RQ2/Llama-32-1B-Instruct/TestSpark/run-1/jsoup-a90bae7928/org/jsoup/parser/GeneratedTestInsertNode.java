package org.jsoup.parser;

public class GeneratedTestInsertNode {

    @Test
    public void testInsertNode() {
        // Create an instance of XmlTreeBuilder and insert a node into it.
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Node(1));

        // Verify that the node is inserted correctly.
        assertNotNull(builder.parseTree().getNodes().get(0).getContent());
    }

}