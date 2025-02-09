package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("TestToString");
        Assert.assertTrue(comment.toString().contains("TestToString"));
    }

}