package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedNodeName_EmptyText_ReturnsEmptyString {

    @Test
    public void nodeName_EmptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.nodeName());
    }

}