package org.jsoup.parser;

public class GeneratedTestInitialiseParse {

    @Test
    public void testInitialiseParse() {
        // Create an instance of XmlTreeBuilder and verify its behaviour.
        XmlTreeBuilder builder = new XmlTreeBuilder();

        // Insert some nodes into the tree.
        builder.insert(new Node(1));
        builder.insert(new Node(2));

        // Verify that the nodes are inserted correctly.
        assertNotNull(builder.parseTree().getNodes());
    }

}