package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateFromEncoded_TextNotNull {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void createFromEncoded_TextNotNull() {
        when(Document.create().outputSettings()).thenReturn(out);
        when(accum.append(anyString())).thenReturn(this.accum);
        TextNode textNode = TextNode.createFromEncoded("test");
        assertNotNull(textNode);
    }

}