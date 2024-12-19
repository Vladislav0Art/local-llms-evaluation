package org.jsoup.nodes;

public class GeneratedTextNodeSplitText_ExtractsAllChildren {

    @Test
    public void TextNodeSplitText_ExtractsAllChildren() {
        String text = "Hello, World!";
        TextNode node = new NodeUnderTest(text);
        String expectedWholeText = "Hello, World!";
        String actualWholeText = node.splitText(0);
        assertEquals(expectedWholeText, actualWholeText);
    }

}