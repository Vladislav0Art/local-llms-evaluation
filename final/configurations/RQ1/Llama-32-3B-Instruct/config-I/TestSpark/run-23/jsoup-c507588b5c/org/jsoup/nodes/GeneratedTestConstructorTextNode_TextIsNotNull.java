package org.jsoup.nodes;

public class GeneratedTestConstructorTextNode_TextIsNotNull {

    @Test
    public void testConstructorTextNode_TextIsNotNull() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.value);
    }

    public String nodeName(TextNode textNode) {
        return "#text";
    }

}