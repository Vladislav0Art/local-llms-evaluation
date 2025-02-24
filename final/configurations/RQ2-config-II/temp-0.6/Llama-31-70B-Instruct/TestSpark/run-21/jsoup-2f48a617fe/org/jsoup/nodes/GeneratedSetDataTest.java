package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSetDataTest {

    private static Comment comment;

    @BeforeClass
    public static void setup() {
        comment = new Comment("some data");
    }

    @Test
    public void setDataTest() {
        comment.setData("new data");
        String data = comment.getData();
        Assert.assertEquals("new data", data);
    }

}