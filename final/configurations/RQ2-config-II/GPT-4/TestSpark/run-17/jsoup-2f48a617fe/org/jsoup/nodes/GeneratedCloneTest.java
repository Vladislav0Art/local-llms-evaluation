package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        Assert.assertNotSame(comment, clonedComment);
        Assert.assertEquals(comment.getData(), clonedComment.getData());
    }

}