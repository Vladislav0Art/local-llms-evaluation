package org.jsoup.nodes;

public class GeneratedClone_ShouldReturnClonedComment {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("testData");
    }

    @Test
    public void clone_ShouldReturnClonedComment() {
        Comment clonedComment = comment.clone();
        assertNotSame(comment, clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

}