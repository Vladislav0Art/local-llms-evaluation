package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("testComment");
        Assert.assertNotNull(comment);
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("testNode");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("testData");
        Assert.assertEquals("testData", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("");
        comment.setData("testDataSet");
        Assert.assertEquals("testDataSet", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("testHtmlHead");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("<!--testHtmlHead-->", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("toStringTest");
        Assert.assertEquals("<!--toStringTest-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("cloneTest");
        Comment cloneComment = comment.clone();
        Assert.assertEquals(comment.toString(), cloneComment.toString());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!?xmlDeclarationTest");
        Assert.assertEquals(true, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("<?xmlDeclare attr=\"value\"?>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        Assert.assertNotNull(xmlDeclaration);
        Assert.assertEquals("xmlDeclare", xmlDeclaration.name());
    }

}