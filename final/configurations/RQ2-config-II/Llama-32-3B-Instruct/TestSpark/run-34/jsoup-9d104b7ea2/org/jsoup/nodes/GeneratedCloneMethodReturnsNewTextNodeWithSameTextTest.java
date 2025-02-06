package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedCloneMethodReturnsNewTextNodeWithSameTextTest {

    @Test
    public void cloneMethodReturnsNewTextNodeWithSameTextTest() {
        String text = "Hello World";
        TextNode originalNode = new TextNode(text);
        TextNode clonedNode = originalNode.clone();
        assertNotNull(clonedNode);
        assertEquals(text, clonedNode.text());
    }

}