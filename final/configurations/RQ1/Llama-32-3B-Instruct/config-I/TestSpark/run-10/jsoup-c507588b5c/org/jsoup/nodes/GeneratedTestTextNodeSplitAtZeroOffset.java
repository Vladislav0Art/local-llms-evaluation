package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeSplitAtZeroOffset {

    @Test
    public void testTextNodeSplitAtZeroOffset() {
        String input = "abcdefg";
        TextNode textNode = new TextNode(input);
        StringBuilder expectedOutput = new StringBuilder("a");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '\0') {
                expectedOutput.append(' ');
                expectedOutput.append(input.charAt(i));
            }
        }
        assertEquals(expectedOutput.toString(), textNode.splitText(0));
    }

}