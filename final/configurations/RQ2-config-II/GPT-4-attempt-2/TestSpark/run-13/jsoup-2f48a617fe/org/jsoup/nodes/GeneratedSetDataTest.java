package org.jsoup.nodes;

import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("newData");
        Assert.assertEquals("newData", comment.getData());
    }

}