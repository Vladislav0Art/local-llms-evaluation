package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.StringWriter;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Some data");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Some data");
        Assert.assertEquals("Some data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Some data");
        comment.setData("New data");
        Assert.assertEquals("New data", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Some data");
        StringWriter outputWriter = new StringWriter();
        comment.outerHtmlHead(outputWriter, 0, new Document("").outputSettings());
        Assert.assertEquals("<!--Some data-->", outputWriter.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Some data");
        StringWriter outputWriter = new StringWriter();
        comment.outerHtmlTail(outputWriter, 0, new Document("").outputSettings());
        Assert.assertEquals("", outputWriter.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Some data");
        Assert.assertEquals("<!--Some data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Some data");
        Comment clone = comment.clone();
        Assert.assertEquals(comment.getData(), clone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        Assert.assertNotNull(xmlDeclaration);
    }

}