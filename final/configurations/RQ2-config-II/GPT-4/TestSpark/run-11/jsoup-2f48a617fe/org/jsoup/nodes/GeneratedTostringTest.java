package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTostringTest {

    @Test
    public void tostringTest() {
        String data = "Test Comment";
        Comment comment = new Comment(data);
        Assert.assertTrue(comment.toString().contains(data));
    }

}