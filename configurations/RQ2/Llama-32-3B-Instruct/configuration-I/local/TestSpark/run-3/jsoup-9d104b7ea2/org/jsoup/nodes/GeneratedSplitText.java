package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText {

    @Mock
    private Appendable accum;

    public String testText() {
        return "Hello World!";
    }

    public String testBlankText() {
        return "";
    }

    public String testEncodedText() {
        return "&lt;Hello World&gt;";
    }

    public String testNormalisedWhitespace() {
        return "   ";
    }

    @Test
    public void splitText() {
        TextNode node = new TextNode("Hello World!");
        when(node.text()).thenReturn("H");
        TextNode newNode = node.splitText(6);
        assertEquals("World", newNode.text());
    }

}