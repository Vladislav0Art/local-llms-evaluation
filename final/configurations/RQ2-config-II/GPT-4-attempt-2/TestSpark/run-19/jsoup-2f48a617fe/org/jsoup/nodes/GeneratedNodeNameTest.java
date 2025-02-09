package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("#comment", comment.nodeName());
    }

}