package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    private static Comment comment;

    @BeforeClass
    public static void setup() {
        comment = new Comment("some data");
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 1, null);
        Assert.assertEquals("", accum.toString());
    }

}