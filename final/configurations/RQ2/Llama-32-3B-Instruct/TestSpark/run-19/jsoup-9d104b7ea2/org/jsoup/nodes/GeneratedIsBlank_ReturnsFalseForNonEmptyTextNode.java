package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedIsBlank_ReturnsFalseForNonEmptyTextNode {

    @Test
    public void isBlank_ReturnsFalseForNonEmptyTextNode() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

}