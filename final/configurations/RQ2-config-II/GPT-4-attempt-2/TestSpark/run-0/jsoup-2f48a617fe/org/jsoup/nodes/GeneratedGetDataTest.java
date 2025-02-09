package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("test", comment.getData());
    }

}