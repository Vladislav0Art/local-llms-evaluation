package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedNodeName_HasName_ReturnsCorrectName {

    @Test
    public void nodeName_HasName_ReturnsCorrectName() {
        TextNode textNode = new TextNode("example");
        assertEquals("example", textNode.nodeName());
    }

}