package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlankReturnsTrueForBlankString {

    @Test
    public void isBlankReturnsTrueForBlankString() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}