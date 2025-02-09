package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("new");
        Assert.assertEquals("new", comment.getData());
    }

}