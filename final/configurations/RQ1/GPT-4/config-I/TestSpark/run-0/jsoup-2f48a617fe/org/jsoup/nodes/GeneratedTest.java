package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeFilter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("Hello, World!");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Hello, World!");
        Assert.assertEquals("Hello, World!", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Hello");
        comment.setData("Hello, World!");
        Assert.assertEquals("Hello, World!", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Hello, World!");

        StringWriter stringWriter = new StringWriter();
        comment.outerHtmlHead(stringWriter, 0, new Document.OutputSettings().prettyPrint(true));

        Assert.assertEquals("<!--Hello, World!-->", stringWriter.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Hello, World!");
        Assert.assertEquals("<!--Hello, World!-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Hello, World!");
        Comment clonedComment = comment.clone();
        Assert.assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void notXmlDeclarationTest() {
        Comment comment = new Comment("Hello, World!");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void notAsXmlDeclarationTest() {
        Comment comment = new Comment("Hello, World!");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}