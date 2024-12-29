package org.jsoup.parser;

public class GeneratedTestPopStackToClose {

    @Test
    public void testPopStackToClose() {
        // Create an instance of XmlTreeBuilder and verify its behaviour.
        XmlTreeBuilder builder = new XmlTreeBuilder();

        // Insert some tokens into the tree to trigger a push operation.
        builder.insert(new Node(1));
        builder.insert(new Token.Comment("test", 3, null));
        builder.insert(new Token.StartTag("tag"));

        // Verify that the stack is popped correctly and the end tag is inserted.
        assertEquals(2, builder.parseTree().getNodes().size());
        assertNotNull(builder.parseTree().getNodes().get(1).getContent());
    }

}