package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("toStringTest");
        Assert.assertEquals("<!--toStringTest-->", comment.toString());
    }

}