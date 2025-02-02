package org.jsoup.nodes;

public class GeneratedClone_CreateCopyOfCommentThatIsIdenticalToTheOriginal {

    @Test
    public void Clone_CreateCopyOfCommentThatIsIdenticalToTheOriginal() {
        Comment comment = new Comment("This is a test comment");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
    }

}