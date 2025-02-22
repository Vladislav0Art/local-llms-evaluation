package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testSplitText() {
        textNode.text("Text");
        TextNode tailNode = textNode.splitText(2);
        assertEquals("Head text should be 'Te'", "Te", textNode.getWholeText());
        assertEquals("Tail text should be 'xt'", "xt", tailNode.getWholeText());
    }

}