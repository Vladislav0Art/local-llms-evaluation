package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Data");
        Assert.assertNull(comment.asXmlDeclaration());
        Comment commentXml = new Comment("?xml version='1.0' ?");
        XmlDeclaration xmlDeclaration = commentXml.asXmlDeclaration();
        Assert.assertEquals("?xml", xmlDeclaration.name());
        Assert.assertEquals("version='1.0'", xmlDeclaration.getWholeDeclaration());
    }

}