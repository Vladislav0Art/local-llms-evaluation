package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSplitText_AtOffsetThrowsException_WhenOffsetIsNegative {

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
    public void splitText_AtOffsetThrowsException_WhenOffsetIsNegative() {
        String rawText = "Hello World";
        TextNode textNode = new TextNode(rawText);
        int offset = -1;
        assertThrows(InvalidDataLengthException.class, () -> textNode.splitText(offset));
    }

}