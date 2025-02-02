package org.jsoup.nodes;

public class GeneratedNewCommentNotXmlDeclaration {

    @Test
    public void newCommentNotXmlDeclaration() {
        Comment comment = new Comment("Hello, World!");
        assertFalse(comment.isXmlDeclaration());
    }
}

public class NodeTest {
    private Node node;

    public NodeTest(Node node) {
        this.node = node;
    }

}