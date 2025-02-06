package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedCreateFromEncodedStringTest {

    @Test
    public void createFromEncodedStringTest() {
        String encodedText = "%3CHello%20World%3E";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("Hello World", node.text());
    }

}