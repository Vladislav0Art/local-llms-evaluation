package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_AccumIsEmpty_DoesNotAppend {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Element parentNode;

    @Test
    public void outerHtmlTail_AccumIsEmpty_DoesNotAppend() {
        when(out.outline()).thenReturn(false);
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum, never()).append(anyString(), anyInt());
    }

}