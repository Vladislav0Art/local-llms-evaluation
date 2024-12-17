package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNode_CreateFromEncoded]

Test {

    @Test
    public void [TextNode_CreateFromEncoded]Test() {
        String encodedText = "&lt;Hello, World!&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("Hello, World!", textNode.text());
    }

}