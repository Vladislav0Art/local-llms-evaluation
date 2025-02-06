package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedNewNodeTextWithWhitespaceTest {

    @Test
    public void newNodeTextWithWhitespaceTest() {
        String text = "   Hello   World  ";
        TextNode node = new TextNode(text);
        assertEquals("   Hello   World  ", node.text());
    }

}