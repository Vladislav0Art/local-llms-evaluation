package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void getNodeId_EmptyData_ReturnsEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.nodeId());
    }

    @Test
    public void getNodeId_NonEmptyData_ReturnsValidId() throws IOException {
        Comment comment = new Comment("non-empty-data");
        String expectedId = comment.nodeId();
        assertNotNull(expectedId);
        assertTrue(expectedId.startsWith("comment"));
    }

    @Test
    public void getData_EmptyComment_ReturnsEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void getData_NonEmptyData_ReturnsValidData() {
        Comment comment = new Comment("non-empty-data");
        String expectedData = "non-empty-data";
        assertEquals(expectedData, comment.getData());
    }

    @Test
    public void setData_EmptyComment_SetToEmptyString() {
        Comment comment = new Comment("");
        comment.setData("");
        assertEquals("", comment.getData());
    }

    @Test
    public void setData_NonEmptyData_SetToValidData() {
        Comment comment = new Comment("non-empty-data");
        String expectedData = "new-data";
        comment.setData(expectedData);
        assertEquals(expectedData, comment.getData());
    }

    @Test
    public void outerHtmlHead_EmptyComment_ReturnsEmptyString() throws IOException {
        Comment comment = new Comment("");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        document(out).outerHtmlHead(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtmlTail_EmptyComment_ReturnsEmptyString() {
        Comment comment = new Comment("");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        document(out).outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtmlHead_NonEmptyComment_SetToValidOutput() throws IOException {
        Comment comment = new Comment("non-empty-data");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.append(anyString())).thenReturn(null);
        document(out).outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append(eq("<!--non-empty-data-->"));
    }

    @Test
    public void outerHtmlTail_NonEmptyComment_SetToValidOutput() {
        Comment comment = new Comment("non-empty-data");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.append(anyString())).thenReturn(null);
        document(out).outerHtmlTail(accum, 0, out);
        verify(accum, times(1)).append(eq("<!--non-empty-data-->"));
    }

    @Test
    public void outerHtmlHead_MultipleComments_SetToValidOutput() throws IOException {
        Comment comment1 = new Comment("data-1");
        Comment comment2 = new Comment("data-2");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.append(anyString())).thenReturn(null);
        document(out).outerHtmlHead(accum, 0, out);
        verify(accum, times(3)).append(eq("<!--data-1-->"));
        verify(accum, times(2)).append(eq("<!--data-2-->"));
    }

    @Test
    public void outerHtmlTail_MultipleComments_SetToValidOutput() {
        Comment comment1 = new Comment("data-1");
        Comment comment2 = new Comment("data-2");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.append(anyString())).thenReturn(null);
        document(out).outerHtmlTail(accum, 0, out);
        verify(accum, times(3)).append(eq("<!--data-1-->"));
        verify(accum, times(2)).append(eq("<!--data-2-->"));
    }

    @Test
    public void toString_EmptyComment_ReturnsEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.toString());
    }

    @Test
    public void toString_NonEmptyData_ReturnsValidOutput() {
        Comment comment = new Comment("non-empty-data");
        String expectedOutput = "<!--non-empty-data-->";
        assertEquals(expectedOutput, comment.toString());
    }

    @Test
    public void clone_EmptyComment_ReturnsNewComment() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertTrue(new Comment(comment.getData()).equals(clonedComment));
    }

    @Test
    public void clone_NonEmptyData_ReturnsNewCommentWithSameData() {
        Comment comment = new Comment("non-empty-data");
        Comment clonedComment = comment.clone();
        assertEquals("non-empty-data", clonedComment.getData());
    }

    @Test
    public void isXmlDeclaration_EmptyComment_ReturnsFalse() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration_NonEmptyData_ReturnsTrue() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_EmptyComment_ReturnsNull() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_NonEmptyData_ReturnsValidDeclaration() {
        Comment comment = new Comment("data");
        XmlDeclaration expectedDeclaration = new XmlDeclaration("data", "xml-data");
        assertNotNull(expectedDeclaration);
        assertEquals("data", expectedDeclaration.getName());
        assertEquals("xml-data", expectedDeclaration.getData());
    }

    private static Document document(Document.OutputSettings out) {
        return new Document(out);
    }

}