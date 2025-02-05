package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringWriter;
import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test data");
        Comment cloned = comment.clone();
        Assert.assertNotNull(cloned);
        Assert.assertEquals(comment.getData(), cloned.getData());
    }

}