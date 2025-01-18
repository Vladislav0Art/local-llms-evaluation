package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Parser;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        String commentData = "test comment";
        Comment comment = new Comment(commentData);
        Assert.assertEquals(commentData, comment.getData());
    }

}