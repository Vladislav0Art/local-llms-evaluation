package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test Data");
        Comment cloneComment = comment.clone();
        Assert.assertNotSame(comment, cloneComment);
        Assert.assertEquals(comment.getData(), cloneComment.getData());
    }

}