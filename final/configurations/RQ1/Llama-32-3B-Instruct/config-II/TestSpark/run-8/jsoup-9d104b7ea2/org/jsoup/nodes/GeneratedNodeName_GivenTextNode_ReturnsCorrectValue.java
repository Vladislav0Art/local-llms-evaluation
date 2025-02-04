package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNodeName_GivenTextNode_ReturnsCorrectValue {

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
    }

}