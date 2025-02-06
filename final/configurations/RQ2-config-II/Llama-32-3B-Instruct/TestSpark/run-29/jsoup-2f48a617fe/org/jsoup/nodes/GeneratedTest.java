package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Test
    public void nodeName_ReturnsCommentName() {
        when(comment.nodeName()).thenReturn("comment");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getData_ThrowsExceptionWhenNoDataIsProvided() {
        assertThrows(NullPointerException.class, () -> comment.getData());
    }

    @Test
    public void setData_SettingData() {
        when(comment.setData(anyString())).thenReturn(comment);
        assertEquals(comment, comment.setData("data"));
    }

    @Test
    public void outerHtmlHead_ThrowsIOExceptionWhenExceptionOccursDuringWritingToAccum() throws IOException {
        when(accum.append(anyString())).thenThrow(new IOException());
        assertThrows(IOException.class, () -> comment.outerHtmlHead(accum, 0, Document.OutputSettings.DEFAULT));
    }

    @Test
    public void outerHtmlTail_RaisesErrorWhenExceptionOccursDuringAppendingToAccum() throws IOException {
        when(accum.append(anyString())).thenThrow(new IOException());
        assertThrows(IOException.class, () -> comment.outerHtmlTail(accum, 0, Document.OutputSettings.DEFAULT));
    }

    @Test
    public void toString_ReturnsCommentData() {
        when(comment.getData()).thenReturn("data");
        assertEquals("data", comment.toString());
    }

    @Test
    public void clone_ReturnsClonedComment() {
        Comment clonedComment = new Comment("data");
        Comment expectedComment = new Comment("data");
        assertSame(expectedComment, comment.clone());
    }

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_ReturnsNullWhenNoDeclarationIsAvailable() {
        assertNull(comment.asXmlDeclaration());
    }

}