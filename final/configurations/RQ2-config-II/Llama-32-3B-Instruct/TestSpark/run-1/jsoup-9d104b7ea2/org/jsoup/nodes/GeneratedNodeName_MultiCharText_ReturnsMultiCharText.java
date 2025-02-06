package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedNodeName_MultiCharText_ReturnsMultiCharText {

    @Test
    public void nodeName_MultiCharText_ReturnsMultiCharText() {
        TextNode textNode = new TextNode("abcdefg");
        assertEquals("abcdefg", textNode.nodeName());
    }

}