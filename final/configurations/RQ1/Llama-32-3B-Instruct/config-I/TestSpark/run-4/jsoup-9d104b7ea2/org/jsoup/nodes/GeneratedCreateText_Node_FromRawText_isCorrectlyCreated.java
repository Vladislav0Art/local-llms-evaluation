package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCreateText_Node_FromRawText_isCorrectlyCreated {

    public static String normaliseWhitespace(String text) {
        return text.replaceAll("\\s+", " ");
    }
}

public class InvalidDataLengthException extends Exception {
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

    public String getNodeName() {
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
        TextNode textNode = TextNode.createTextNode(rawText);
        assertEquals(StringUtil.normaliseWhitespace(rawText), textNode.getText());
    }

}