package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNodeName_ReturnsCorrectValue {

    @Test
    public void nodeName_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("Some text");
        assertEquals("#text", textNode.nodeName());
    }

}