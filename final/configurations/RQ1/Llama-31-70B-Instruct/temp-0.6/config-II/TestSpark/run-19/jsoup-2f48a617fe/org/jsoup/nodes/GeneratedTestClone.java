package org.jsoup.nodes;

public class GeneratedTestClone {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testClone() {
        Comment clone = comment.clone();
        assertEquals("#comment", clone.nodeName());
        assertEquals("comment", clone.getData());
    }

}