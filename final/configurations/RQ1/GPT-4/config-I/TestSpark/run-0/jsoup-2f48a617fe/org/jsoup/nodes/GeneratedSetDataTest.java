package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeFilter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Hello");
        comment.setData("Hello, World!");
        Assert.assertEquals("Hello, World!", comment.getData());
    }

}