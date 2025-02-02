package org.jsoup.nodes;

public class GeneratedTest {

    public InvalidDataLengthException(String message) {
        super(message);
    }
}

public class TextNode {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static String getNodeName() {
        return "#text";
    }

    public static TextNode createTextNode(String text) {
        return new TextNode(text);
    }
}

public class GeneratedTest {

    @Test
    public void createText_Node_FromRawText_isCorrectlyCreated() {
        String rawText = "Hello World";
        TextNode textNode = new TextNode(rawText);
        assertEquals(rawText, textNode.text());
    }

    @Test
    public void nodeName_ForTextNode_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void createTextNode_FromEncodedText_isCorrectlyCreated() {
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.text());
    }

    @Test
    public void splitText_AtOffsetReturnsCorrectlySplitTextNode() {
        String rawText = "Hello World";
        TextNode textNode = new TextNode(rawText);
        int offset = 6;
        TextNode resultTextNode = textNode.splitText(offset);
        assertEquals("World", resultTextNode.text());
        assertEquals("Hello ", textNode.text());
    }

}