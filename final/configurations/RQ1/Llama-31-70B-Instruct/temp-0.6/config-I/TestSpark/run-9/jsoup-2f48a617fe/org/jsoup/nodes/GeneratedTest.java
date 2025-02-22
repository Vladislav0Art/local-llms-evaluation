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

public class GeneratedTest {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("test");
    }

    @Test
    public void testNodeName() {
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        Assert.assertEquals("test", comment.getData());
    }

    @Test
    public void testSetData() {
        comment.setData("newData");
        Assert.assertEquals("newData", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, null);
        Assert.assertEquals("<!--test-->", sb.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlTail(sb, 0, null);
        Assert.assertEquals("", sb.toString());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void testClone() {
        Comment clone = (Comment) comment.clone();
        Assert.assertEquals("test", clone.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}