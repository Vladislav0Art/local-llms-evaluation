package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("<!--testData-->", comment.toString());
    }

}