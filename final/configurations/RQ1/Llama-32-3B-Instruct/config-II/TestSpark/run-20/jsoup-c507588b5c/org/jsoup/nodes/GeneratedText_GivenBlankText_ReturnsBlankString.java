package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_GivenBlankText_ReturnsBlankString {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Test
    public void text_GivenBlankText_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}