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

public class GeneratedOuterHtmlHeadTest {

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

}