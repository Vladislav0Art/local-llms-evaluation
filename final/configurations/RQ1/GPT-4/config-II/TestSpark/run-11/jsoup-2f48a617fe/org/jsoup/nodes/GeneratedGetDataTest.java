package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test data");

        Assert.assertEquals("Test data", comment.getData());
    }

}