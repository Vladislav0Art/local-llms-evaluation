package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.getData()).thenReturn("testData");

        assertEquals("testData", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.doReturn(null).when(comment).setData("testData");

        comment.setData("testData");
        Mockito.verify(comment).setData("testData");
    }

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.doReturn("testData").when(comment).getData();

        Appendable accum = Mockito.mock(Appendable.class);
        Mockito.doNothing().when(accum).append(Mockito.anyString());

        int depth = 1;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);

        comment.outerHtmlHead(accum, depth, out);

        Mockito.verify(accum).append("<!--");
        Mockito.verify(accum).append("testData");
        Mockito.verify(accum).append("-->");
    }

}