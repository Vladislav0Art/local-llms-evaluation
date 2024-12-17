package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToString_Atomantic_Return_SimpleString_TextNode_Test {

    @Test
    public void toString_Atomantic_Return_SimpleString_TextNode_Test() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        String tokenisedText = ((TextNode) mockText()).toString();
        assertTrue(tokenisedText.equals("text"));
    }
}

class MockTextNode implements TextNode {

    @Override
    public boolean isBlank() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public String text() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setText(String value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String nodeName() {
        return "text";
    }

    @Override
    public String toString() {
        return "text";
    }
}

}