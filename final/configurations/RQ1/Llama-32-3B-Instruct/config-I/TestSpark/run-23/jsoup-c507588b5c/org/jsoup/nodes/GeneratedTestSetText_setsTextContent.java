package org.jsoup.nodes;

public class GeneratedTestSetText_setsTextContent {

    @Test
    public void testSetText_setsTextContent() {
        String text = "New Hello World!";
        TextNode textNode = new TextNode();
        setText(textNode, text);
        assertEquals("New Hello World!", textNode.value);
    }

    public String getWholeText(TextNode textNode) throws IOException {
        return textNode.value;
    }

}