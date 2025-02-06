package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_TextReturnsText {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void text_TextReturnsText() {
        String expectedText = "test";
        when(accum.append(expectedText)).thenReturn(this.accum);
        TextNode textNode = new TextNode("");
        assertEquals(expectedText, textNode.text());
    }

}