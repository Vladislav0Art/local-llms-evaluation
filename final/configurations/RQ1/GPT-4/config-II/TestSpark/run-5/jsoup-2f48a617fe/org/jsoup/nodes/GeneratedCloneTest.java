package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment cloneComment = comment.clone();

        Assert.assertEquals(comment.getData(), cloneComment.getData());
        Assert.assertNotSame(comment, cloneComment);
    }

}