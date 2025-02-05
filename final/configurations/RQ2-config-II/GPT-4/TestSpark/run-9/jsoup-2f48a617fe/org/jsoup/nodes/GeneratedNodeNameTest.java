package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Test Comment");
        Assert.assertEquals("#comment", comment.nodeName());
    }

}