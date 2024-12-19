package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeNotEmpty {

    @Test
    public void testTextNodeNotEmpty() {
        TextNode textNode = new TextNode("test");

        assertFalse(false, textNode.isEmpty());
    }
}

class TextNode {

    private String value;

    public TextNode(String value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TextNode) {
            return value.equals(((TextNode) obj).value);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return value.hashCode();
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

    public String get

    nodeName() {
        return value;
    }

    public void setText(String value) {
        this.value = value;
    }

}