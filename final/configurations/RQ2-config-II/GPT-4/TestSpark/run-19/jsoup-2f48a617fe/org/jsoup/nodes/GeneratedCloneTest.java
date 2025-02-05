package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test comment");
        Comment clonedComment = comment.clone();

        Assert.assertEquals(comment.getData(), clonedComment.getData());
        Assert.assertNotSame(comment, clonedComment);
    }

}