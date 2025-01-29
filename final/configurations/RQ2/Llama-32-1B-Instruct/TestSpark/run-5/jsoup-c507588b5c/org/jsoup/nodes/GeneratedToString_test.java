package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedToString_test {

    @Test
    public void toString_test() {
        TextNode node = new TextNode("Hello World");
        String output = node.toString();
        assertEquals("<text> Hello <span>World</span></text>", output);
    }

}