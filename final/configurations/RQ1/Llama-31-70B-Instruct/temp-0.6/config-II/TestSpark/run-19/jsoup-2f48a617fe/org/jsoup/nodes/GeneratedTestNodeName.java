package org.jsoup.nodes;

public class GeneratedTestNodeName {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

}