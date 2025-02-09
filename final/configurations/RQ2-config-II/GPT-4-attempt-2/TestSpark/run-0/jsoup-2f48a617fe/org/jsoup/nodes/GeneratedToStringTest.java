package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test");
        Assert.assertTrue(comment.toString().contains("test"));  // verify it contains the comment
    }

}