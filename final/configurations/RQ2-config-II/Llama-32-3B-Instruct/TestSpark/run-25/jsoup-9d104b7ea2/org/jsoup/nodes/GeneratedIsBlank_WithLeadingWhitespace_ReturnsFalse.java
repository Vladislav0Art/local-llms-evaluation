package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlank_WithLeadingWhitespace_ReturnsFalse {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void isBlank_WithLeadingWhitespace_ReturnsFalse() {
        TextNode textNode = new TextNode(" ");
        assertFalse(textNode.isBlank());
    }

}