package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedNodeName_NoName_ReturnsEmptyString {

    @Test
    public void nodeName_NoName_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.nodeName());
    }

}