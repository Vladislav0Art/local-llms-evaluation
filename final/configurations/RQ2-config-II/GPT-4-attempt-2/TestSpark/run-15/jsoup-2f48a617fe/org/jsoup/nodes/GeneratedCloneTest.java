package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test clone");
        Comment clonedNode = comment.clone();
        Assert.assertEquals(comment.getData(), clonedNode.getData());
    }

}