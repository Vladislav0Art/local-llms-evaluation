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
        Comment originalComment = new Comment("Test");
        Comment clonedComment = originalComment.clone();

        Assert.assertNotSame(originalComment, clonedComment);
        Assert.assertEquals(originalComment.getData(), clonedComment.getData());
    }

}