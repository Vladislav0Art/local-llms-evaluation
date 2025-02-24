package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("text");
        textNode.text("some other text");
        assertEquals("some other text", textNode.text());
    }

}