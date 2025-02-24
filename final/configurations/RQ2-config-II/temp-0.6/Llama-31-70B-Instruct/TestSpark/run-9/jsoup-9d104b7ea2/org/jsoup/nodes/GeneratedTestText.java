package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("testNode");
        assertEquals("testNode", textNode.text());
    }

}