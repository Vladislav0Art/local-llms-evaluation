package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeSplitText {

    @Test
    public void testTextNodeSplitText() {
        String text = "Hello World\n";
        TestTextNodeNode node = new TextNodeNode(text, "Hello World");
        String[] splitText = node.splitText(0);
        assertEquals("Hello", splitText[0].trim());
        assertTrue(splitText.length == 1);

        text = "Hello World\n\n";
        TestTextNodeNode node2 = new TextNodeNode(text, "Hello World");
        String[] splitText2 = node2.splitText(0);
        assertEquals("Hello", splitText2[0].trim());
        assertTrue(splitText2.length == 1);

        text = "Hello World\na";
        TestTextNodeNode node3 = new TextNodeNode(text, "Hello World");
        String[] splitText3 = node3.splitText(0);
        assertEquals("Hello", splitText3[0].trim());
        assertTrue(splitText3.length == 1);

        text = "a";
        TestTextNodeNode node4 = new TextNodeNode(text, "a");
        String[] splitText4 = node4.splitText(0);
        assertEquals("a", splitText4[0].trim());
    }

}