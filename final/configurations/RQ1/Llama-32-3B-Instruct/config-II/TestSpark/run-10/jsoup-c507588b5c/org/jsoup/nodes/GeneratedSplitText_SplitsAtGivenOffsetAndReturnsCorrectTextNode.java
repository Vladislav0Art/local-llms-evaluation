package org.jsoup.nodes;

public class GeneratedSplitText_SplitsAtGivenOffsetAndReturnsCorrectTextNode {

    @Test
    public void splitText_SplitsAtGivenOffsetAndReturnsCorrectTextNode() throws IOException {
        String text = "text";
        int offset = 3;
        TextNode textNode = new TextNode(text);
        String expectedHead = text.substring(0, offset);
        String expectedTail = text.substring(offset);
        TextNode tailNode = new TextNode(expectedTail);
        textNode.splitText(offset);
        assertEquals(expectedHead, textNode.getWholeText());
        assertEquals(tailNode, textNode.nextSibling());
    }

}