package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

    @Test
    public void outerHtmlHead_AccumHasContent_DoesNotIndent() {
        when(accum.hasText()).thenReturn(true);
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum, never()).indent(anyInt(), anyInt(), any(Document.OutputSettings.class));
    }

    @Test
    public void outerHtmlHead_AccumIsEmpty_DoesIndent() {
        when(accum.hasText()).thenReturn(false);
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).indent(anyInt(), anyInt(), any(Document.OutputSettings.class));
    }

    @Test
    public void outerHtmlTail_AccumHasContent_DoesNotAppend() {
        when(out.outline()).thenReturn(true);
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum, never()).append(anyString(), anyInt());
    }

    @Test
    public void outerHtmlTail_AccumIsEmpty_DoesNotAppend() {
        when(out.outline()).thenReturn(false);
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum, never()).append(anyString(), anyInt());
    }

    @Test
    public void getData_ReturnsValue() {
        Comment comment = new Comment("<!-- comment -->");
        assertEquals("<!-- comment -->", comment.getData());
    }

    @Test
    public void setData_SetData() {
        Comment comment = new Comment("<!-- comment -->");
        String newData = "new data";
        comment.setData(newData);
        assertEquals("new data", comment.getData());
    }

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        Comment comment = new Comment("<!-- comment -->");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_ReturnsNull() {
        Comment comment = new Comment("<!-- comment -->");
        assertNull(comment.asXmlDeclaration());
    }

}