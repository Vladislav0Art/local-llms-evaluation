package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test data");
        Comment cloneComment = comment.clone();
        Assert.assertNotNull(cloneComment);
        Assert.assertEquals(comment.getData(), cloneComment.getData());
    }

}