package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataAndSetDataTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("data", comment.getData());
        comment.setData("newData");
        Assert.assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        Assert.assertEquals("<!--data-->", accum.toString());
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals("<!--data-->", comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Assert.assertEquals(comment.getData(), comment.clone().getData());
    }

    @Test
    public void isXmlDeclarationFalseTest() {
        Comment comment = new Comment("data");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationTrueTest() {
        Comment comment = new Comment("!xml");
        Assert.assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationNullTest() {
        Comment comment = new Comment("!xml");
        Assert.assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationNonNullTest() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        Assert.assertNotNull(xmlDeclaration);
        Assert.assertEquals("xml", xmlDeclaration.name());
        Assert.assertEquals("yes", xmlDeclaration.attr("standalone"));
        Assert.assertEquals("UTF-8", xmlDeclaration.attr("encoding"));
    }

    @Test
    public void asXmlDeclarationExceptionTest() {
        Comment comment = new Comment("?");
        comment.asXmlDeclaration();
    }

}