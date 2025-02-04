package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Generated[
Document appendChild][withTextNode]

Test {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [Document appendChild][withTextNode]Test() {
        TextNode textNode = new TextNode("Hello World");
        document.appendChild(textNode);
        assertEquals(1, textNode.getSiblingIndex());
    }

}