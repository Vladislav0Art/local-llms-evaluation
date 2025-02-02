package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCreateTextNode_FromEncodedText_isCorrectlyCreated {

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
    public void createTextNode_FromEncodedText_isCorrectlyCreated() {
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createTextNode(encodedText);
        assertEquals(encodedText, textNode.getText());
    }

}