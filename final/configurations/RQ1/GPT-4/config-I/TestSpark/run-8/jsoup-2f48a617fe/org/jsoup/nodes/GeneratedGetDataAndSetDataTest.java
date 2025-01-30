package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedGetDataAndSetDataTest {

    @Test
    public void getDataAndSetDataTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("data", comment.getData());
        comment.setData("newData");
        Assert.assertEquals("newData", comment.getData());
    }

}