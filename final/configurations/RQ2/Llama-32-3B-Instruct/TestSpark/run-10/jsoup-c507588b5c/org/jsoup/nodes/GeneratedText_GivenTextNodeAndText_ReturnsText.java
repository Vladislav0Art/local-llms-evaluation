package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_GivenTextNodeAndText_ReturnsText {

    @Mock
    private String text;

    @Mock
    private Appendable accum;

    @Test
    public void text_GivenTextNodeAndText_ReturnsText() {
        String textToSet = "Hello World!";
        when(text).thenReturn(textToSet);
        TextNode textNode = new TextNode(text);
        assertEquals(textToSet, textNode.text());
    }

}