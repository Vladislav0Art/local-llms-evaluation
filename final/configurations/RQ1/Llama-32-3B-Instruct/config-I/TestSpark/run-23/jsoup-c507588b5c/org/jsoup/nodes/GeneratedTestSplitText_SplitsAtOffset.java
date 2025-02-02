package org.jsoup.nodes;

public class GeneratedTestSplitText_SplitsAtOffset {

    @Test
    public void testSplitText_SplitsAtOffset() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode tailNode = splitText(textNode, offset);
        assertEquals(0, offset, tailNode.value.length());
    }

}