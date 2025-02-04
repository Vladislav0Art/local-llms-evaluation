package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_AccumIsEmpty_DoesIndent {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

    @Test
    public void outerHtmlHead_AccumIsEmpty_DoesIndent() {
        when(accum.hasText()).thenReturn(false);
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).indent(anyInt(), anyInt(), any(Document.OutputSettings.class));
    }

}