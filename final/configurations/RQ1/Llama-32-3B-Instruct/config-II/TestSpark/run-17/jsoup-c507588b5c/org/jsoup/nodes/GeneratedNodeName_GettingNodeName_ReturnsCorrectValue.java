package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_GettingNodeName_ReturnsCorrectValue {

    @Test
    public void nodeName_GettingNodeName_ReturnsCorrectValue() throws Exception {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

}