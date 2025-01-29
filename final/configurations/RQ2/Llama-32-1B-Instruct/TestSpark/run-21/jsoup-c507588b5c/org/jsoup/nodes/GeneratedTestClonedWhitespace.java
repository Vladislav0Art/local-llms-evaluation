package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestClonedWhitespace {

    @Test
    public void testClonedWhitespace() {
        String text = "   Hello  ";
        String clonedText = TextNode.cloneText(text);
        assertTrue(clonedText.contains("   "));
        assertFalse(clonedText.contains("Hello"));
        assertFalse(clonedText.contains("World"));
    }

}