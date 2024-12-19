package org.jsoup.nodes;

public class GeneratedTestClone {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a test comment -->");
    }

    @Test
    public void testClone() {
        Comment clone = (Comment) comment.clone();
        assertEquals(comment, clone);
    }

}