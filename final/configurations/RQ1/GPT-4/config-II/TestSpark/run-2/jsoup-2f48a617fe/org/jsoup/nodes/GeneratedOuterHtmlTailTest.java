package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Test comment");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlTail(sb, 0, null);
        Assert.assertEquals("", sb.toString()); // The method does not append anything to accumulator
    }

}