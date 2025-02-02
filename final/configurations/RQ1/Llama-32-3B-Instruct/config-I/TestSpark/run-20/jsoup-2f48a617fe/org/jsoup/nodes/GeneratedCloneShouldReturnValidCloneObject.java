package org.jsoup.nodes;

public class GeneratedCloneShouldReturnValidCloneObject {

    @Test
    public void cloneShouldReturnValidCloneObject() throws CloneNotSupportedException {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertTrue(clonedComment instanceof Comment);
        assertEquals(comment.nodeName(), clonedComment.nodeName());
        assertEquals(comment.getData(), clonedComment.getData());
    }

}