package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedNewNodeTextBlankTest {

    @Test
    public void newNodeTextBlankTest() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}