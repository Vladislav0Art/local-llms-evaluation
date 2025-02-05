package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;

import java.io.StringWriter;
import java.io.Writer;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("TestingClone");
        Comment clone = comment.clone();
        Assert.assertNotSame(comment, clone);
        Assert.assertEquals(comment.getData(), clone.getData());
    }

}