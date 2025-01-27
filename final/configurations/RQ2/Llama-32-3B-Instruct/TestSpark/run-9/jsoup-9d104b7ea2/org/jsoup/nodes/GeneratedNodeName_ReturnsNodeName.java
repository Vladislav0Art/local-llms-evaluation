package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedNodeName_ReturnsNodeName {

    @Test
    public void nodeName_ReturnsNodeName() {
        TextNode textNode = new TextNode("node");
        assertEquals("node", textNode.nodeName());
    }

}