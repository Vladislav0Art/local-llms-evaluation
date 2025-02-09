package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void commentConstructorTest() {
        Comment comment = new Comment("data");
        Assert.assertNotNull(comment);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        Assert.assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        comment.outerHtmlHead(accum, 0, out);
        Assert.assertTrue(accum.toString().contains("<!--data-->"));
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        comment.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("<!--data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        Assert.assertNotSame(comment, cloned);
        Assert.assertEquals(comment.getData(), cloned.getData());
    }

    @Test
    public void isXmlDeclarationTrueTest() {
        Comment comment = new Comment("?xml version='1.0' encoding='UTF-8' standalone='yes' ?");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationFalseTest() {
        Comment comment = new Comment("Not a declaration");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTrueTest() {
        Comment comment = new Comment("?xml version='1.0' encoding='UTF-8' standalone='yes' ?");
        Assert.assertNotNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationFalseTest() {
        Comment comment = new Comment("Not a declaration");
        Assert.assertNull(comment.asXmlDeclaration());
    }

}