package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("test1");
        assertEquals("test1", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.getData()).thenReturn("test");
        Mockito.when(comment.siblingIndex()).thenReturn(0);
        Mockito.when(comment.parentNode()).thenReturn(new Element("test"));
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);
        Mockito.when(out.outline()).thenReturn(true);
        try {
            Appendable accum = Mockito.mock(Appendable.class);
            comment.outerHtmlHead(accum, 0, out);
            Mockito.verify(accum).append("<!--");
            Mockito.verify(accum).append("test");
            Mockito.verify(accum).append("-->");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void outerHtmlTailTest() {
        Comment comment = Mockito.mock(Comment.class);
        try {
            Appendable accum = Mockito.mock(Appendable.class);
            comment.outerHtmlTail(accum, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}