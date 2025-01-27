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
public class GeneratedGetWholeText_GivenTextNode_ReturnsText {

    @Mock
    private String text;

    @Mock
    private Appendable accum;

    @Test
    public void getWholeText_GivenTextNode_ReturnsText() {
        String wholeText = "Hello World!";
        when(text).thenReturn(wholeText);
        TextNode textNode = new TextNode(text);
        assertEquals(wholeText, textNode.getWholeText());
    }

}