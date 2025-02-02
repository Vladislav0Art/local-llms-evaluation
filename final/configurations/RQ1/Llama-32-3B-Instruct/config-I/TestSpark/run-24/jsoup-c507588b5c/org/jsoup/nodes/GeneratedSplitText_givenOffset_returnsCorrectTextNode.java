package org.jsoup.nodes;

public class GeneratedSplitText_givenOffset_returnsCorrectTextNode {

    @Test
    public void splitText_givenOffset_returnsCorrectTextNode() throws Exception {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode expectedHead = new TextNode("Hello");
        TextNode expectedTail = new TextNode(StringUtil.normaliseWhitespace("World"));
        int offset = 6;
        Object[] result = testSplitText(text, textNode, offset);
        assertEquals(expectedHead.nodeName(), result[0].nodeName());
        assertEquals(expectedTail.text(), (String) result[1]);
    }

    private Object[] testSplitText(String text, TextNode textNode, int offset) throws Exception {
        String head = text.substring(0, offset);
        String tail = text.substring(offset);
        return new Object[]{new TextNode(head), new TextNode(tail)};
    }

}