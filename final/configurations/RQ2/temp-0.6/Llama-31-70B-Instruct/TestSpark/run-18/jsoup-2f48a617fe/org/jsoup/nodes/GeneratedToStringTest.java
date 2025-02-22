package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("<!--test-->", comment.toString());
    }

}