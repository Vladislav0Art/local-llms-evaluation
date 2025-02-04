package org.jsoup.nodes;

public class GeneratedClone_returnsSameComment {

    @Test
    public void clone_returnsSameComment() {
        Comment comment = new Comment("Data");
        Comment cloned = comment.clone();
        assertSame(comment, cloned);
    }

}