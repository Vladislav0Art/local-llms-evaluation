package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToString_TokenisedString_Test {

    @Test
    public void toString_TokenisedString_Test() {
        String tokenisedText = "\\lt\\gt\\s+Hello\\s+World\\s+\\lt\\gt";
        assertEquals(tokenisedText, ((TextNode) mockText()).toString());
    }
}

class MockTextNode extends TextNode {
    @Override
    public String nodeName() {
        return "mock";
    }

    @Override
    public String text() {
        return "";
    }

    @Override
    public String getWholeText() {
        return "";
    }

    @Override
    public boolean isBlank() {
        return true;
    }

    @Override
    public TextNode splitText(int offset) {
        return this;
    }

}