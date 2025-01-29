package org.jsoup.nodes;

public class GeneratedNodeName_thenReturnNodeName {

    private Comment comment;

    @Before
    public void setup() {
        String data = "<!-- this is a test comment -->";
        comment = new Comment(data);
    }

    @Test
    public void nodeName_thenReturnNodeName() {
        assertEquals(Comment.class, comment.nodeName());
    }
}

public class LeafNodeTest extends LeafNode {
    public LeafNodeTest() {
        super();
    }

}