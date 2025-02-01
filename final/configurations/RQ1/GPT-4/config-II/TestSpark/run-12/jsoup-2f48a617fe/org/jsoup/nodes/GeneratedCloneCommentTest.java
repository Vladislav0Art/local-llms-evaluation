package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedCloneCommentTest {

    @Test
    public void cloneCommentTest() {
        Comment comment = new Comment("test comment");
        Comment clonedComment = comment.clone();
        Assert.assertEquals(comment.getData(), clonedComment.getData());
    }

}