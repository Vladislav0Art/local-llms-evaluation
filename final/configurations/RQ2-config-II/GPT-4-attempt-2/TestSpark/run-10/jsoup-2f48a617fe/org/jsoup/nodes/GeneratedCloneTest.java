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
        Comment comment = new Comment("Clone me");
        Comment cloned = comment.clone();

        Assert.assertEquals(comment.getData(), cloned.getData());
        Assert.assertNotSame(comment, cloned);
    }

}