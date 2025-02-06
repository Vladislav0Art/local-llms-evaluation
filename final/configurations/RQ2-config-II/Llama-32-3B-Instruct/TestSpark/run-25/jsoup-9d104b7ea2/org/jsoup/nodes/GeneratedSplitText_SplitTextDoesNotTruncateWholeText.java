package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_SplitTextDoesNotTruncateWholeText {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void splitText_SplitTextDoesNotTruncateWholeText() {
        TextNode textNode = new TextNode("test");
        StringBuilder expected = new StringBuilder("te");
        when(accum.append(expected)).thenReturn(this.accum);
        when(accum.append(anyString())).thenReturn(this.accum);
        when(out.depth()).thenReturn(1);
        textNode.splitText(2);
        assertEquals("test", textNode.text());
    }

}