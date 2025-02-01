package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Initial comment");
        comment.setData("New comment");
        Assert.assertEquals("New comment", comment.getData());
    }

}