package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedSplitText {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void splitText() {
        TextNode textNode = new TextNode("test");
        TextNode result1 = (TextNode) textNode.splitText(0);
        assertEquals("test", result1.text());

        TextNode result2 = (TextNode) textNode.splitText(3);
        assertEquals("", result2.text());
    }

}