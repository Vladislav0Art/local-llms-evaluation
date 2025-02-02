package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_GivenTextNode_ReturnsCorrectNodeName {

    public String normaliseWhitespace(String input) {
        // implementation of StringUtil.normaliseWhitespace method
        return input.replaceAll("\\s+", " ");
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

}