package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedNodeName_NamedNode_ReturnsCorrectName {

    @Test
    public void nodeName_NamedNode_ReturnsCorrectName() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

}