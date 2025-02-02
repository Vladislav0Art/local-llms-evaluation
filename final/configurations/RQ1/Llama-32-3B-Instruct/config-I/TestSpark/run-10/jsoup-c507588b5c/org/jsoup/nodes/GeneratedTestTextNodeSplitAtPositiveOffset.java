package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextNodeSplitAtPositiveOffset {

    @Test
    public void testTextNodeSplitAtPositiveOffset() {
        String input = "abcdefg";
        TextNode textNode = new TextNode(input);
        StringBuilder expectedOutput = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) != '\0') {
                expectedOutput.append(' ');
                expectedOutput.append(input.charAt(i));
            }
        }
        assertEquals(expectedOutput.toString(), textNode.splitText(1));
    }

}