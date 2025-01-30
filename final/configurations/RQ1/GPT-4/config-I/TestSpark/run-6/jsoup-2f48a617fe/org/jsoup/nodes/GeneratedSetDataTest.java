package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");
        comment.setData("testDataSet");
        Assert.assertEquals("testDataSet", comment.getData());
    }

}