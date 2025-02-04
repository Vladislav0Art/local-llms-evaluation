package org.jsoup.nodes;

public class GeneratedSplitTextNegativeOffsetTest {

    @Test
    public void splitTextNegativeOffsetTest() {
        TextNode node = new TextNode("test");
        int offset = -1;
        assertThrows(IllegalArgumentException.class, () -> node.splitText(offset));
    }

}