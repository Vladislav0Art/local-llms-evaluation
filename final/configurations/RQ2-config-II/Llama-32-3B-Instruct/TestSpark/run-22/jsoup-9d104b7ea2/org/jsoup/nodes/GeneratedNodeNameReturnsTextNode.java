package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameReturnsTextNode {

    @Test
    public void nodeNameReturnsTextNode() {
        TextNode textNode = new TextNode("text");
        assertEquals(TextNode.class.getName(), textNode.nodeName());
    }

}