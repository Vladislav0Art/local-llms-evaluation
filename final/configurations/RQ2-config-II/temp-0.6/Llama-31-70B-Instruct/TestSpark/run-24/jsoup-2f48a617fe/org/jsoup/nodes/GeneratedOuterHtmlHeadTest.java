package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

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

}