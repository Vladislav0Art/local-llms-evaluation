package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedNodeName_WillReturnNodeName {

    @Test
    public void nodeName_WillReturnNodeName() {
        TextNode node = new TextNode("node");
        assertEquals("node", node.nodeName());
    }

}