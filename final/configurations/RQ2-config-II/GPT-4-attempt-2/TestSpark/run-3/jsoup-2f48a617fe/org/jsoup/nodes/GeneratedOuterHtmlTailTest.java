package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Data");
        StringWriter stringWriter = new StringWriter();
        comment.outerHtmlTail(stringWriter, 0, new Document.OutputSettings());
        Assert.assertEquals("", stringWriter.toString());
    }

}