package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class GeneratedNodeName_TextNode {

    @Test
    public void nodeName_TextNode() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

}