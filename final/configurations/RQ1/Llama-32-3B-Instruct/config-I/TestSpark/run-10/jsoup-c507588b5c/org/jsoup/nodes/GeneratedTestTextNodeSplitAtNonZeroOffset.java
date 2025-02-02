package org.jsoup.nodes;

public class GeneratedTestTextNodeSplitAtNonZeroOffset {

    @Test
    public void testTextNodeSplitAtNonZeroOffset() {
        String input = "abcdefg";
        StringBuilder expectedOutput = new StringBuilder("ab");
        for (int i = 2; i < input.length(); i++) {
            if (i == 1) {
                expectedOutput.append(' ');
            }
            expectedOutput.append(input.charAt(i));
        }
        assertEquals(expectedOutput.toString(), new TextNode(input).splitText(1));
    }

}