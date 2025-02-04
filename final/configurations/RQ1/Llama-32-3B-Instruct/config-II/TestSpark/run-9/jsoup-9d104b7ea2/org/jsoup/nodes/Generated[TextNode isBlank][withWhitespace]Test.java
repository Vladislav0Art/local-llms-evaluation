package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Generated[
TextNode isBlank][withWhitespace]

Test {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [TextNode isBlank][withWhitespace]Test() {
        textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

}