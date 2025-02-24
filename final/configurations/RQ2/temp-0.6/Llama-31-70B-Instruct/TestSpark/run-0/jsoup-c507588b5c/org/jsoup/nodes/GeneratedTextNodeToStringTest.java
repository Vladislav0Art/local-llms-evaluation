package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextNodeToStringTest {

    @Test
    public void textNodeToStringTest() {
        TextNode textNode = new TextNode("Some text");
        assertEquals("Some text", textNode.toString());
    }

}