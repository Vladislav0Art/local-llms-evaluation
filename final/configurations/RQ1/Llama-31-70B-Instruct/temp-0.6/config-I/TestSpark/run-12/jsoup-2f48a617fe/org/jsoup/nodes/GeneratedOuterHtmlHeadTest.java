package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = Mockito.mock(Comment.class);
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);

        when(comment.getData()).thenReturn("test");
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(false);

        comment.outerHtmlHead(accum, 0, out);

        Mockito.verify(accum).append("<!--test-->");
    }

}