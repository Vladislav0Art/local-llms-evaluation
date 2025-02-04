package org.jsoup.nodes;

public class GeneratedSplitText_SplitAtOffset_GreaterThanLength_ReturnsSameTextNode {

    @Test
    public void splitText_SplitAtOffset_GreaterThanLength_ReturnsSameTextNode() throws IOException {
        String text = "Hello World!";
        int offset = 8;
        TextNode originalTextNode = new TextNode(text);
        TextNode newTextNode = originalTextNode.splitText(offset);
        assertEquals(originalTextNode.text(), newTextNode.text());
    }

}