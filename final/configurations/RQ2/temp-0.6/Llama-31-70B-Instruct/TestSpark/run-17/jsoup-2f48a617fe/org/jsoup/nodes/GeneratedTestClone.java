package org.jsoup.nodes;

public class GeneratedTestClone {

    private Comment comment;
    private String data;

    @Before
    public void setUp() {
        data = "This is a test.";
        comment = new Comment(data);
    }

    @Test
    public void testClone() {
        Comment clone = comment.clone();
        assertNotSame(comment, clone);
        assertEquals(comment.getData(), clone.getData());
    }

}