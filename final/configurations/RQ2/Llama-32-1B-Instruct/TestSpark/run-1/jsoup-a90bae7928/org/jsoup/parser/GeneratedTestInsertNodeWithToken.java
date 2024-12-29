package org.jsoup.parser;

public class GeneratedTestInsertNodeWithToken {

    @Test
    public void testInsertNodeWithToken() {
        // Create an instance of XmlTreeBuilder and insert a token into it.
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Node(1));

        // Verify that the token is inserted correctly with the node.
        assertNotNull(builder.parseTree().getNodes().get(0).getContent());
    }

}