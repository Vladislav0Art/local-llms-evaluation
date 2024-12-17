package org.jsoup.nodes;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);

        int offset1 = 0;
        TextNode nodeAfterOffset1 = textNode.splitText(offset1);
        assertEquals("Hello", nodeAfterOffset1.text());

        int offset2 = 6;
        TextNode nodeAfterOffset2 = textNode.splitText(offset2);
        assertEquals("World\n", nodeAfterOffset2.getWholeText());
    }

}