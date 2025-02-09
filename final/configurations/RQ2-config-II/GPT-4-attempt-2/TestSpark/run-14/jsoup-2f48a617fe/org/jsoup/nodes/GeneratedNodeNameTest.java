package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("TestNode");
        Assert.assertEquals("#comment", comment.nodeName());
    }

}