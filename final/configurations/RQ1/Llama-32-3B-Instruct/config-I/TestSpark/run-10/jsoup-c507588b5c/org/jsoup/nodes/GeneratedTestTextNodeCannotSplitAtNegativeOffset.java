package org.jsoup.nodes;

public class GeneratedTestTextNodeCannotSplitAtNegativeOffset {

    @Test
    public void testTextNodeCannotSplitAtNegativeOffset() {
        String input = "abcdefg";
        StringBuilder expectedOutput = new StringBuilder("abcdefg");
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                expectedOutput.append(' ');
            }
            expectedOutput.append(input.charAt(i));
        }
        assertEquals(expectedOutput.toString(), new TextNode(input).splitText(-1));
    }

}