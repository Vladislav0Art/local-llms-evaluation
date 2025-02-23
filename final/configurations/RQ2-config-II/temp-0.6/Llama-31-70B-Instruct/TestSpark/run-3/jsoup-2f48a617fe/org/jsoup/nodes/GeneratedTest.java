package org.jsoup.nodes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void shouldGetData() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

    @Test
    public void shouldSetData() {
        Comment comment = new Comment("Hello World");
        comment.setData("Hello Universe");
        assertEquals("Hello Universe", comment.getData());
    }

    @Test
    public void shouldRenderOuterHtmlHeadAsExpected() throws IOException {
        Comment comment = new Comment("Hello World");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(false);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--Hello World-->", accum.toString());
    }

    @Test
    public void shouldRenderOuterHtmlHeadWithPrettyPrintAndOutline() throws IOException {
        Comment comment = new Comment("Hello World");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(true);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--Hello World-->", accum.toString());
    }

}