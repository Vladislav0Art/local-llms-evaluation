package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createCommentWithData_ReturnsComment() {
        Comment comment = new Comment("Some data");
        assertNotNull(comment);
    }

    @Test
    public void nodeName

    ReturnsCorrectString() {
        Comment comment = new Comment("Some data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getData

    ReturnsCorrectData() {
        Comment comment = new Comment("<!-- Some XML Declaration -->");
        assertEquals("<!-- Some XML Declaration -->", comment.getData());
    }

    @Test
    public void setData

    SetsCorrectData() {
        String data = "Some data";
        Comment comment = new Comment(data);
        comment.setData("Another data");
        assertEquals("Another data", comment.getData());
    }

    @Test
    public void outerHtmlHeadDoesNotAppendAnything_WhenNoPrettyPrintingAndOutlineIsDisabled() throws IOException {
        Comment comment = new Comment("Some data");
        Appendable accum = mock(appendable.class);
        Document.OutputSettings out = mock(outputSettings.class);
        Document doc = mock(document.class);
        when(out.prettyPrint()).thenReturn(false);
        when(out.outline()).thenReturn(false);
        comment.outerHtmlHead(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

    @Test
    public void outerHtmlTail

    DoesNotAppendAnything() {
        Comment comment = new Comment("Some data");
        Appendable accum = mock(appendable.class);
        Document.OutputSettings out = mock(outputSettings.class);
        comment.outerHtmlTail(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

    @Test
    public void outerHtml

    ReturnsCorrectOuterHTML() throws IOException {
        Comment comment = new Comment("<!-- Some XML Declaration -->");
        Appendable accum = mock(appendable.class);
        Document.OutputSettings out = mock(outputSettings.class);
        Document doc = mock(document.class);
        when(out.prettyPrint()).thenReturn(true);
        when(doc.body().children().size()).thenReturn(1);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!-- Some XML Declaration -->", accum.toString());
    }

    @Test
    public void clone

    ReturnsSameComment() {
        Comment comment = new Comment("Some data");
        Comment cloned = comment.clone();
        assertSame(comment, cloned);
    }

    @Test
    public void isXmlDeclaration_ReturnsTrueWhenDataStartsWithExclamationMark() {
        Comment comment = new Comment("!-- Some XML Declaration -->");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration

    ReturnsFalseOtherwise() {
        Comment comment = new Comment("Some data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration

    ReturnsNullWhenDataDoesNotMatchXMLDeclarationFormat() throws IOException {
        Comment comment = new Comment("<!-- Some data -->");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration

    ReturnsCorrectDeclarationWhenDataMatchesFormat() throws IOException {
        Comment comment = new Comment("<!-- !DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\" -->");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
    }

    @Test
    public void asXmlDeclaration

    SetsAttributesFromElement() {
        Comment comment = new Comment("<!-- !DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\" -->");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration.attributes());
    }

}