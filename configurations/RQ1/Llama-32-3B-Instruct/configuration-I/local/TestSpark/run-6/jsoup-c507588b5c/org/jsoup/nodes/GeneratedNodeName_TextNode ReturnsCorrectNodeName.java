package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_TextNode ReturnsCorrectNodeName {

    @Test
    public void nodeName_TextNode

    ReturnsCorrectNodeName() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

}