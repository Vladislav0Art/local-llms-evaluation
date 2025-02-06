package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeName_ReturnsnodeName {

    @Test
    public void nodeName_ReturnsnodeName() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

}