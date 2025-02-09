package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Data");
        Assert.assertFalse(comment.isXmlDeclaration());
        Comment commentXml = new Comment("?xml version='1.0' ?");
        Assert.assertTrue(commentXml.isXmlDeclaration());
    }

}