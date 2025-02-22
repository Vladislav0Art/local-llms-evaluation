package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTestToString {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("test");
    }

    @Test
    public void testToString() {
        Assert.assertEquals("<!--test-->", comment.toString());
    }

}