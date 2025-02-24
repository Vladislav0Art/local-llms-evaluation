package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class GeneratedToStringTest {

    private static Comment comment;

    @BeforeClass
    public static void setup() {
        comment = new Comment("some data");
    }

    @Test
    public void toStringTest() {
        Assert.assertEquals("<!--some data-->", comment.toString());
    }

}