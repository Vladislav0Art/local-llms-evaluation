package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_AccumHasContent_DoesNotIndent {

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

}