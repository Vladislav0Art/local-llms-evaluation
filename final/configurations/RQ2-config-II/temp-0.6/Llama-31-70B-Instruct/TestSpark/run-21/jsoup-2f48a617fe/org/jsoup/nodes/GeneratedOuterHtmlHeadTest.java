package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    private static Comment comment;

    @BeforeClass
    public static void setup() {
        comment = new Comment("some data");
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 1, null);
        Assert.assertEquals("<!---->", accum.toString());
    }

}