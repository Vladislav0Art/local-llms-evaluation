package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Comment comment = new Comment("testData");
        Assert.assertNotNull(comment);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("testData", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("testData");
        comment.setData("newData");
        Assert.assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accumulator = new StringBuilder();
        Comment comment = new Comment("testData");
        comment.outerHtmlHead(accumulator, 0, new Document.OutputSettings());
        Assert.assertTrue(accumulator.toString().contains("testData"));
    }

    @Test
    public void outerHtmlTailTest() {
        StringBuilder accumulator = new StringBuilder();
        Comment comment = new Comment("testData");
        comment.outerHtmlTail(accumulator, 0, new Document.OutputSettings());
        Assert.assertEquals("", accumulator.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("testData");
        Assert.assertFalse(comment.toString().isEmpty());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testData");
        Comment clone = comment.clone();
        Assert.assertNotSame(clone, comment);
        Assert.assertEquals(comment.getData(), clone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("testData");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("testData");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}