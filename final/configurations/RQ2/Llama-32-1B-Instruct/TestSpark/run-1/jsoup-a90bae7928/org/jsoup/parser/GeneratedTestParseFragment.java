package org.jsoup.parser;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        // Create an instance of XmlTreeBuilder and parse a fragment into it.
        XmlTreeBuilder builder = new XmlTreeBuilder();

        // Insert some nodes into the tree to trigger a push operation.
        builder.insert(new Node(1));
        builder.insert(new Token.StartTag("tag"));

        // Parse a fragment from the tree.
        String inputFragment = "test";
        builder.parse(inputFragment, null);

        // Verify that the parsed fragment is returned correctly.
        assertNotNull(builder.parseTree().getNodes());
    }

}