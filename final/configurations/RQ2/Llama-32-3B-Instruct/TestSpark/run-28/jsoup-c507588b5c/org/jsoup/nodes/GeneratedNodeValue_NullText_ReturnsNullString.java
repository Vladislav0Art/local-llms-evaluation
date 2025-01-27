package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeValue_NullText_ReturnsNullString {

    @Test
    public void nodeValue_NullText_ReturnsNullString() {
        TextNode textNode = new TextNode(null);
        assertNull(textNode.nodeValue());
    }
}

public class TextNode {

    private String value;

    public TextNode(String value) {
        this.value = value;
    }

    public Class<?> nodeName() {
        return TextNode.class;
    }

    public String nodeValue() {
        return value;
    }

}