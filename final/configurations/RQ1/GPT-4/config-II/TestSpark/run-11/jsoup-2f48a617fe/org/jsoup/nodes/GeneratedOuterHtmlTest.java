package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Comment comment = new Comment("Test data");
        String expected = "<!--Test data-->";

        Assert.assertEquals(expected, comment.outerHtml());
    }

}