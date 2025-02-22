package org.jsoup.nodes;

public class GeneratedTestClone {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some comment");
    }

    @Test
    public void testClone() {
        Comment clone = comment.clone();
        assertNotSame(comment, clone);
        assertEquals(comment.getData(), clone.getData());
    }

}