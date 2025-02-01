package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test data");
        Assert.assertEquals("test data", comment.getData());
    }

}