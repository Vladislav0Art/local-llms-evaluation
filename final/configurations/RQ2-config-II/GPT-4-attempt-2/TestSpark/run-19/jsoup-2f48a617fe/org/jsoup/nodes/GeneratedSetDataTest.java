package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        Assert.assertEquals("newData", comment.getData());
    }

}