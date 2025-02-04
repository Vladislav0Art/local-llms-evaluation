package org.jsoup.nodes;

public class GeneratedSplitTextZeroOffsetTest {

    @Test
    public void splitTextZeroOffsetTest() {
        TextNode node = new TextNode("test");
        int offset = 0;
        TextNode tailNode = node.splitText(offset);
        assertEquals(0, tailNode.text().length());
    }

}