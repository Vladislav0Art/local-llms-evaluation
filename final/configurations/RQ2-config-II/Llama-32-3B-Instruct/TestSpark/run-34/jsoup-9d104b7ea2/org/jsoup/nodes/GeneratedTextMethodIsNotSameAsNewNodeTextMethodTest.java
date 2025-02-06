package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedTextMethodIsNotSameAsNewNodeTextMethodTest {

    @Test
    public void textMethodIsNotSameAsNewNodeTextMethodTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotEquals(node.text(), node.nodeName());
    }

}