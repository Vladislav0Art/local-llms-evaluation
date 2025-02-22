package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("This is a comment");
        Comment newComment = comment.setData("This is new comment");
        assertEquals("This is new comment", newComment.getData());
    }

}