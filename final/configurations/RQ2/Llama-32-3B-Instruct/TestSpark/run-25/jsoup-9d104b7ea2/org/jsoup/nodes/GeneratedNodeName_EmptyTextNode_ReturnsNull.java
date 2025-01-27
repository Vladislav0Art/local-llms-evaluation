package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_EmptyTextNode_ReturnsNull {

    @Test
    public void nodeName_EmptyTextNode_ReturnsNull() {
        TextNode node = new TextNode("");
        assertEquals(null, node.nodeName());
    }

}