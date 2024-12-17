package org.jsoup.nodes;

public class GeneratedSplitText_returnsNewNode_withTextBeforeOffset {

    @Test
    public void splitText_returnsNewNode_withTextBeforeOffset() {
        String text = "Hello\nWorld";
        TextNode node = createTextNode(splitText(1));
        assertEquals("Hello", node.text());
    }

}