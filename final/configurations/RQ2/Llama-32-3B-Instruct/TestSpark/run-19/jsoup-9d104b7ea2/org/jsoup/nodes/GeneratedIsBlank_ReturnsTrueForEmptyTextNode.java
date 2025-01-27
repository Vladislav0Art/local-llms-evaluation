package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class GeneratedIsBlank_ReturnsTrueForEmptyTextNode {

    @Test
    public void isBlank_ReturnsTrueForEmptyTextNode() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}