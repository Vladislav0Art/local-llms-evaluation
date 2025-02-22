package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSplitText {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("text");
    }

    @Test
    public void testSplitText() {
        TextNode textNode2 = textNode.splitText(2);
        assertEquals(textNode.coreValue(), "te");
        assertEquals(textNode2.coreValue(), "xt");
    }

}