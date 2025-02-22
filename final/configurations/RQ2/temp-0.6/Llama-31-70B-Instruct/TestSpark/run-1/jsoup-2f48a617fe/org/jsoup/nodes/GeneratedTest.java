package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        Assert.assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("test1");
        Assert.assertEquals("test1", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(false);
        comment.outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append("<!--");
        verify(accum, times(1)).append("test");
        verify(accum, times(1)).append("-->");
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        comment.outerHtmlTail(accum, 0, out);
        verify(accum, times(0)).append("<!--");
        verify(accum, times(0)).append("test");
        verify(accum, times(0)).append("-->");
    }

}