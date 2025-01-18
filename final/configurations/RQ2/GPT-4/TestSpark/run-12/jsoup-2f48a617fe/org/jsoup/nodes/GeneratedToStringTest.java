package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Parser;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String expectedToString = "<!--test comment-->";
        Comment comment = new Comment("test comment");
        Assert.assertEquals(expectedToString, comment.toString());
    }

}