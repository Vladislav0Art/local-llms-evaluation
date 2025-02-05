package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;

import java.io.StringWriter;
import java.io.Writer;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("AnotherTest");
        Assert.assertEquals("AnotherTest", comment.getData());
    }

}