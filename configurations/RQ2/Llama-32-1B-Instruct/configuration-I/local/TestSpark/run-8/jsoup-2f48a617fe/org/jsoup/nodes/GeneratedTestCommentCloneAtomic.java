package org.jsoup.nodes;

public class GeneratedTestCommentCloneAtomic {


    private Comment comment;

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentCloneAtomic() {
        String data = "Example text";
        comment = new Comment(data);
        Comment actual = (Comment) comment.clone();
        assertEquals(data, actual.getData());
    }

}