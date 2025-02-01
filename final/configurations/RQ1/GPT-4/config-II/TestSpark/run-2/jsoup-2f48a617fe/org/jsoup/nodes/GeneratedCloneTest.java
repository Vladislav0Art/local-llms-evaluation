package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test comment");
        Assert.assertEquals(comment.getData(), comment.clone().getData());
    }

}