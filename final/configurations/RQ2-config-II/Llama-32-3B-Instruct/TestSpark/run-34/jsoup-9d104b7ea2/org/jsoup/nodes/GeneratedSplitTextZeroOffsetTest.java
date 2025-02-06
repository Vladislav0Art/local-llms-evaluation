package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedSplitTextZeroOffsetTest {

    @Test
    public void splitTextZeroOffsetTest() {
        TextNode node = new TextNode("Hello World");
        TextNode newNode = node.splitText(0);
        assertNotNull(newNode);
        assertEquals("Hello World", newNode.text());
    }

}