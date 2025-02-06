package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void newCommentShouldReturnSameObject() {
        Comment comment = new Comment("");
        Assert.assertEquals(comment, comment.clone());
    }

    @Test
    public void nodeNameMethodReturnsComment() {
        Comment comment = new Comment("");
        Element element = Mockito.mock(Element.class);
        comment.setNodeElement(element);
        Assert.assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataMethodReturnsStringData() {
        Comment comment = new Comment("");
        String data = "data";
        comment.setData(data);
        Assert.assertEquals(data, comment.getData());
    }

    @Test
    public void setDataMethodSetsCorrectData() {
        Comment comment = new Comment("");
        String data = "newData";
        comment.setData(data);
        Assert.assertEquals(data, comment.getData());
    }

    @Test
    public void outerHtmlHeadShouldAccumulateHtmlData() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document document = new Document();
        Comment comment = new Comment("");
        comment.setNodeElement(document.createElement("div"));
        comment.outerHtmlHead(accum, 0, null);
        accum.assertValueContains("<div>");
    }

    @Test
    public void outerHtmlTailShouldAccumulateEmptyHtmlData() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document document = new Document();
        Comment comment = new Comment("");
        comment.setNodeElement(document.createElement("div"));
        comment.outerHtmlTail(accum, 0, null);
        accum.assertValueContains("");
    }

    @Test
    public void toStringShouldReturnCommentData() {
        Comment comment = new Comment("");
        String expected = "<!-- data -->";
        Assert.assertEquals(expected, comment.toString());
    }

    @Test
    public void cloneMethodReturnsSameComment() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        Assert.assertSame(comment, cloned);
    }

    @Test
    public void isXmlDeclarationShouldReturnFalse() {
        Comment comment = new Comment("");
        boolean expected = false;
        Assert.assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationShouldReturnNullIfNotXmlDeclaration() {
        Comment comment = new Comment("");
        XmlDeclaration xmlDeclaration = Mockito.mock(XmlDeclaration.class);
        comment.asXmlDeclaration();
        Assert.assertNull(xmlDeclaration);
    }

}