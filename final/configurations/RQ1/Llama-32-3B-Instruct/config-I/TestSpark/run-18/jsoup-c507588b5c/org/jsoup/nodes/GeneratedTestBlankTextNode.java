package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestBlankTextNode {

    private String value;

    public TextNode(String value) {
        this.value = value;
    }

    public boolean isBlank() {
        return false;
    }

    public byte[] splitText(int length) {
        // mock implementation
        return new byte[10];
    }
}

public class GeneratedTest {

    @Test
    public void testBlankTextNode() {
        assertFalse(new TextNode("").isBlank());
    }

}