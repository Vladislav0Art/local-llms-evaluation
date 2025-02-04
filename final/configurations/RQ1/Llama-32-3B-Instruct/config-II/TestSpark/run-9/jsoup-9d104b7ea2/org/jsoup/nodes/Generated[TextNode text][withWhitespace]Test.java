package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Generated[
TextNode text][withWhitespace]

Test {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [TextNode text][withWhitespace]Test() {
        textNode = new TextNode("Hello World ");
        assertEquals("Hello World", textNode.text());
    }

}