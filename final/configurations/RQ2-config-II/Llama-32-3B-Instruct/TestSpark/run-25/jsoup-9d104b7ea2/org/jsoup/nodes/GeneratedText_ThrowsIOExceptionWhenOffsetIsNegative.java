package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_ThrowsIOExceptionWhenOffsetIsNegative {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void text_ThrowsIOExceptionWhenOffsetIsNegative() {
        TextNode textNode = new TextNode("");
        when(accum.append(anyString())).thenReturn(this.accum);
        assertThrows(IOException.class, () -> textNode.text(-1));
    }

}