package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(JUnit4.class)
public class GeneratedTextTextNodeSplitTest {

    @Test
    public void textTextNodeSplitTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode tailNode = textNode.splitText(5);
        assertEquals("Hello", textNode.text());
        assertEquals(" World", tailNode.text());
    }

}