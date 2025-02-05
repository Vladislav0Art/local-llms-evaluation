package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test Comment");
        Comment cloneComment = comment.clone();
        Assert.assertEquals(comment.getData(), cloneComment.getData());
    }

}