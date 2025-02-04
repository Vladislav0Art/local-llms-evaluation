package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncoded {

    @Test
    public void createFromEncoded() {
        String encodedText = "&lt;Hello&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("&lt;Hello&gt;", node.getWholeText());
    }

}