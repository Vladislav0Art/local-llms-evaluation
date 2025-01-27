package org.jsoup.nodes;

public class GeneratedSplitText_SplitAtOffset_ReturnsSplitText {

    @Test
    public void splitText_SplitAtOffset_ReturnsSplitText() {
        TextNode node = new TextNode("Hello World");
        TextNode expected = new TextNode("Hello");
        Node child = new LeafNode("");
        assertEquals(expected, node.splitText(6).child(0));
    }

}