package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("testNode");
        Assert.assertEquals("#comment", comment.nodeName());
    }

}